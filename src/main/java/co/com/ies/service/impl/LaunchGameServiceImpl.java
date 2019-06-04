package co.com.ies.service.impl;

import co.com.ies.domain.enumeration.Message;
import co.com.ies.domain.enumeration.Url;
import co.com.ies.domain.service.impl.LaunchGameDomainService;
import co.com.ies.service.LaunchGameService;
import co.com.ies.service.dto.LaunchGameInDto;
import co.com.ies.service.dto.LaunchGameOutDto;
import co.com.ies.service.dto.OperatorModuleDto;
import co.com.ies.service.dto.sub.StatusDto;
import co.com.ies.service.error.BadRequestException;
import co.com.ies.service.error.OperatorModuleDataException;
import co.com.ies.service.error.OperatorModuleException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class LaunchGameServiceImpl extends LaunchGameDomainService implements LaunchGameService {

  @Autowired
  private RestTemplate restTemplate;

  private final Logger log = LoggerFactory.getLogger(LaunchGameServiceImpl.class);

  /**
   * Se consume a OperatorModule que es quien provee el acceso.
   */
  public LaunchGameOutDto getGame(LaunchGameInDto operatorInDto) {
    log.debug("****Ejecución del servicio****");

    try {
      isOkOperatorInData(operatorInDto);
    } catch (BadRequestException e) {
      log.error(e.getMessage());
      return new LaunchGameOutDto(null,
          new StatusDto(Message.BAD_REQUEST_OPERATOR.getCode(), e.getMessage()));
    }

    OperatorModuleDto operatorModuleOutDto = operatorInToOperatorModuleOut(
        operatorInDto);

    OperatorModuleDto operatorModuleInDto;
    try {
      operatorModuleInDto = getGameToken(operatorModuleOutDto);
    } catch (OperatorModuleException e) {
      log.warn("SE CAPTURO EXCEPCION EN TRANSACTION EXCEPTION");
      log.error(e.getMessage());
      return new LaunchGameOutDto(null,
          new StatusDto(Message.INTERNAL_TRANSACTION_ERROR.getCode(), e.getMessage()));
    }

    try {
      isOkOperatorModuleInData(operatorModuleInDto);
    } catch (OperatorModuleDataException e) {
      log.error(e.getMessage());
      return new LaunchGameOutDto(null,
          new StatusDto(Message.BAD_RESPONSE_TRANSACTION.getCode(), e.getMessage()));
    }

    return operatorModuleInToOperatorOut(operatorModuleInDto);
  }

  @Override
  public Logger getLogger() {
    return log;
  }

  @Override
  public OperatorModuleDto getGameToken(OperatorModuleDto operatorModuleOutDto)
      throws OperatorModuleException {
    getLogger().debug("****getGameToken****");
    final String endPoint = Url.CACHE.getUrl();
    getLogger().debug(endPoint);
    OperatorModuleDto operatorModuleInDto = null;
    try {
      HttpEntity<OperatorModuleDto> request = new HttpEntity<>(operatorModuleOutDto);
      operatorModuleInDto =
          restTemplate.postForObject(endPoint.toLowerCase(), request, OperatorModuleDto.class);
    } catch (HttpStatusCodeException e) {
      getLogger().warn("SE CAPTURA HTTP STATUS CODE EXCEPTION");
      gestionHttpStatusCodeException(e);
    } catch (RestClientException e) {
      getLogger().warn("SE CAPTURA REST CLIENT EXCEPTION");
      throw new OperatorModuleException(e.getMessage());
    }
    return operatorModuleInDto;
  }

  /**
   * .
   * 
   * @param exception .
   * @throws OperatorModuleException .
   */
  public void gestionHttpStatusCodeException(HttpStatusCodeException exception)
      throws OperatorModuleException {
    getLogger().debug("HttpStatusCodeException");

    final String bodyResponseError = exception.getResponseBodyAsString();
    final HttpStatus statusCode = exception.getStatusCode();

    log.debug(bodyResponseError);

    OperatorModuleException errorEnLaPeticion = new OperatorModuleException("Error en la peticion");

    if (isNull(bodyResponseError) || !HttpStatus.INTERNAL_SERVER_ERROR.equals(statusCode)) {
      throw errorEnLaPeticion;
    }

    ObjectMapper mapper = new ObjectMapper();

    Map<String, String> map = null;

    // convert JSON string to Map
    try {
      map = mapper.readValue(bodyResponseError, new TypeReference<Map<String, String>>() {
      });
    } catch (IOException e) {
      getLogger().error("{}",(Object[]) e.getStackTrace());
    }

    if (map == null) {
      throw errorEnLaPeticion;
    }

    boolean containMessage = map.containsKey("message");

    if (!containMessage) {
      throw errorEnLaPeticion;
    }

    final String message = map.get("message");

    throw new OperatorModuleException(message);
  }
}
