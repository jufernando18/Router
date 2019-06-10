package co.com.ies.service.impl;

import co.com.ies.domain.enumeration.Message;
import co.com.ies.domain.enumeration.Url;
import co.com.ies.domain.service.impl.OperatorDomainService;
import co.com.ies.service.OperatorService;
import co.com.ies.service.dto.operator.GetAllRafflesRequest;
import co.com.ies.service.dto.operator.GetAllRafflesResponse;
import co.com.ies.service.dto.operator.GetRafflesRequest;
import co.com.ies.service.dto.operator.GetRafflesResponse;
import co.com.ies.service.dto.operator.GetRoomsRequest;
import co.com.ies.service.dto.operator.GetRoomsResponse;
import co.com.ies.service.dto.operator.LaunchGameRequest;
import co.com.ies.service.dto.operator.LaunchGameResponse;
import co.com.ies.service.dto.operatormodule.GetAllRafflesModuleRequest;
import co.com.ies.service.dto.operatormodule.GetAllRafflesModuleResponse;
import co.com.ies.service.dto.operatormodule.GetRafflesModuleRequest;
import co.com.ies.service.dto.operatormodule.GetRafflesModuleResponse;
import co.com.ies.service.dto.operatormodule.GetRoomsModuleRequest;
import co.com.ies.service.dto.operatormodule.GetRoomsModuleResponse;
import co.com.ies.service.dto.operatormodule.LaunchGameModuleRequest;
import co.com.ies.service.dto.operatormodule.LaunchGameModuleResponse;
import co.com.ies.service.dto.sub.StatusDto;
import co.com.ies.service.error.BadRequestException;
import co.com.ies.service.error.BadResponseException;
import co.com.ies.service.error.OperatorModuleException;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OperatorServiceImpl extends OperatorDomainService implements OperatorService {

  @Autowired
  RestTemplate restTemplate;

  private final Logger log = LoggerFactory.getLogger(OperatorServiceImpl.class);

  /*
   * @Autowired Validator validator;
   */

  @Override
  public LaunchGameResponse getGame(LaunchGameRequest request) {
    LaunchGameModuleRequest requestModule = null;
    LaunchGameModuleResponse responseModule = null;
    LaunchGameResponse response = null;
    try {
      requestModule = operatorToModuleLaunchGameRequest(request);
    } catch (BadRequestException e) {
      return new LaunchGameResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(e.getMessage()));
    }
    try {
      final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl()
          .concat(Url.LAUNCH_GAME.getUrl());
      HttpEntity<LaunchGameModuleRequest> requestModuleEntity = new HttpEntity<>(requestModule);
      responseModule = restTemplate.postForObject(endpoint.toLowerCase(), requestModuleEntity,
          LaunchGameModuleResponse.class);
    } catch (HttpStatusCodeException e) {
      return new LaunchGameResponse()
          .setStatus(new StatusDto().setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode())
              .setErrorMsg(gestionHttpStatusCodeException(e)));
    } catch (RestClientException e) {
      return new LaunchGameResponse().setStatus(new StatusDto()
          .setErrorCode(Message.INTERNAL_OPERATOR_ERROR.getCode()).setErrorMsg(e.getMessage()));
    }
    try {
      response = moduleToOperatorLaunchGameResponse(responseModule);
    } catch (BadResponseException e) {
      return new LaunchGameResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_RESPONSE_TRANSACTION.getCode()).setErrorMsg(e.getMessage()));
    }

    return response;
  }

  @Override
  public GetRoomsResponse getRooms(GetRoomsRequest request) {
    GetRoomsModuleRequest requestModule = null;
    GetRoomsModuleResponse responseModule = null;
    GetRoomsResponse response = null;
    try {
      requestModule = operatorToModuleRoomsRequest(request);
    } catch (BadRequestException e) {
      return new GetRoomsResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(e.getMessage()));
    }
    try {
      final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl().concat(Url.GET_ROOMS.getUrl());
      HttpEntity<GetRoomsModuleRequest> requestModuleEntity = new HttpEntity<>(requestModule);
      responseModule = restTemplate.postForObject(endpoint.toLowerCase(), requestModuleEntity,
          GetRoomsModuleResponse.class);
    } catch (HttpStatusCodeException e) {
      return new GetRoomsResponse()
          .setStatus(new StatusDto().setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode())
              .setErrorMsg(gestionHttpStatusCodeException(e)));
    } catch (RestClientException e) {
      return new GetRoomsResponse().setStatus(new StatusDto()
          .setErrorCode(Message.INTERNAL_OPERATOR_ERROR.getCode()).setErrorMsg(e.getMessage()));
    }
    try {
      response = moduleToOperatorRoomsResponse(responseModule);
    } catch (BadResponseException e) {
      return new GetRoomsResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_RESPONSE_TRANSACTION.getCode()).setErrorMsg(e.getMessage()));
    }

    return response;
  }

  @Override
  public GetRafflesResponse getRaffles(GetRafflesRequest request) {
    GetRafflesModuleRequest requestModule = null;
    GetRafflesModuleResponse responseModule = null;
    GetRafflesResponse response = null;
    try {
      requestModule = operatorToModuleRafflesRequest(request);
    } catch (BadRequestException e) {
      return new GetRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(e.getMessage()));
    }
    try {
      final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl()
          .concat(Url.GET_RAFFLES.getUrl());
      HttpEntity<GetRafflesModuleRequest> requestModuleEntity = new HttpEntity<>(requestModule);
      responseModule = restTemplate.postForObject(endpoint.toLowerCase(), requestModuleEntity,
          GetRafflesModuleResponse.class);
    } catch (HttpStatusCodeException e) {
      return new GetRafflesResponse()
          .setStatus(new StatusDto().setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode())
              .setErrorMsg(gestionHttpStatusCodeException(e)));
    } catch (RestClientException e) {
      return new GetRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.INTERNAL_OPERATOR_ERROR.getCode()).setErrorMsg(e.getMessage()));
    }
    try {
      response = moduleToOperatorRafflesResponse(responseModule);
    } catch (BadResponseException e) {
      return new GetRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_RESPONSE_TRANSACTION.getCode()).setErrorMsg(e.getMessage()));
    }

    return response;
  }

  @Override
  public GetAllRafflesResponse getAllRaffles(GetAllRafflesRequest request) {
    GetAllRafflesModuleRequest requestModule = null;
    GetAllRafflesModuleResponse responseModule = null;
    GetAllRafflesResponse response = null;
    try {
      requestModule = operatorToModuleAllRafflesRequest(request);
    } catch (BadRequestException e) {
      return new GetAllRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(e.getMessage()));
    }
    try {
      final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl()
          .concat(Url.GET_ALL_RAFFLES.getUrl());
      HttpEntity<GetAllRafflesModuleRequest> requestModuleEntity = new HttpEntity<>(requestModule);
      responseModule = restTemplate.postForObject(endpoint.toLowerCase(), requestModuleEntity,
          GetAllRafflesModuleResponse.class);
    } catch (HttpStatusCodeException e) {
      return new GetAllRafflesResponse()
          .setStatus(new StatusDto().setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode())
              .setErrorMsg(gestionHttpStatusCodeException(e)));
    } catch (RestClientException e) {
      return new GetAllRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.INTERNAL_OPERATOR_ERROR.getCode()).setErrorMsg(e.getMessage()));
    }
    try {
      response = moduleToOperatorAllRafflesResponse(responseModule);
    } catch (BadResponseException e) {
      return new GetAllRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_RESPONSE_TRANSACTION.getCode()).setErrorMsg(e.getMessage()));
    }

    return response;
  }

  /**
   * .
   * 
   * @param exception .
   */
  public String gestionHttpStatusCodeException(HttpStatusCodeException exception) {

    final String defaultError = "Error in the intern request";
    final String bodyResponseError = exception.getResponseBodyAsString();
    final HttpStatus statusCode = exception.getStatusCode();

    log.debug(bodyResponseError);

    if (isNull(bodyResponseError) || !HttpStatus.INTERNAL_SERVER_ERROR.equals(statusCode)) {
      return defaultError;
    }

    ObjectMapper mapper = new ObjectMapper();

    Map<String, String> map = null;

    // convert JSON string to Map
    try {
      map = mapper.readValue(bodyResponseError, new TypeReference<Map<String, String>>() {
      });
    } catch (IOException e) {
      log.error("{}", (Object[]) e.getStackTrace());
      return defaultError;
    }

    if (map == null) {
      return defaultError;
    }

    boolean containMessage = map.containsKey("message");

    if (!containMessage) {
      return defaultError;
    }

    final String message = map.get("message");

    return message;
  }

  public <T> boolean isNull(T obj) {
    return obj == null;
  }
}
