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

import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OperatorServiceImpl extends OperatorDomainService implements OperatorService {

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  Validator validator;

  @Override
  public LaunchGameResponse getGame(LaunchGameRequest request) {
    LaunchGameModuleRequest requestModule = null;
    LaunchGameResponse response = null;
    try {
      requestModule = operatorToModuleLaunchGameRequest(request);
    } catch (BadRequestException e) {
      return new LaunchGameResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(e.getMessage()));
    }
    final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl().concat(Url.LAUNCH_GAME.getUrl());
    HttpEntity<LaunchGameModuleRequest> requestModuleEntity = new HttpEntity<>(requestModule);
    LaunchGameModuleResponse responseModule = restTemplate.postForObject(endpoint.toLowerCase(),
        requestModuleEntity, LaunchGameModuleResponse.class);
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
    GetRoomsResponse response = null;
    try {
      requestModule = operatorToModuleRoomsRequest(request);
    } catch (BadRequestException e) {
      return new GetRoomsResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(e.getMessage()));
    }
    final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl().concat(Url.GET_ROOMS.getUrl());
    HttpEntity<GetRoomsModuleRequest> requestModuleEntity = new HttpEntity<>(requestModule);
    GetRoomsModuleResponse responseModule = restTemplate.postForObject(endpoint.toLowerCase(),
        requestModuleEntity, GetRoomsModuleResponse.class);
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
    GetRafflesResponse response = null;
    try {
      requestModule = operatorToModuleRafflesRequest(request);
    } catch (BadRequestException e) {
      return new GetRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(e.getMessage()));
    }
    final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl().concat(Url.GET_RAFFLES.getUrl());
    HttpEntity<GetRafflesModuleRequest> requestModuleEntity = new HttpEntity<>(requestModule);
    GetRafflesModuleResponse responseModule = restTemplate.postForObject(endpoint.toLowerCase(),
        requestModuleEntity, GetRafflesModuleResponse.class);
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
    GetAllRafflesResponse response = null;
    try {
      requestModule = operatorToModuleAllRafflesRequest(request);
    } catch (BadRequestException e) {
      return new GetAllRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(e.getMessage()));
    }
    final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl()
        .concat(Url.GET_ALL_RAFFLES.getUrl());
    HttpEntity<GetAllRafflesModuleRequest> requestModuleEntity = new HttpEntity<>(requestModule);
    GetAllRafflesModuleResponse responseModule = restTemplate.postForObject(endpoint.toLowerCase(),
        requestModuleEntity, GetAllRafflesModuleResponse.class);
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
   * @param <T>     .
   * @param request .
   * @throws BadRequestException .
   */
  @Override
  public <T> void validateRequestDto(T request) throws BadRequestException {
    Set<ConstraintViolation<T>> violations = validator.validate(request);
    Optional<ConstraintViolation<T>> firstViolation = violations.stream().findFirst();
    if (firstViolation.isPresent()) {
      ConstraintViolation<T> firstError = firstViolation.get();
      String violation = firstError.getPropertyPath().toString().concat(" ")
          .concat(firstError.getMessage());
      throw new BadRequestException(violation);
    }
  }

  /**
   * .
   * 
   * @param <T>      .
   * @param response .
   * @throws BadResponseException .
   */
  @Override
  public <T> void validateResponseDto(T response) throws BadResponseException {
    Set<ConstraintViolation<T>> violations = validator.validate(response);
    Optional<ConstraintViolation<T>> firstViolation = violations.stream().findFirst();
    if (firstViolation.isPresent()) {
      ConstraintViolation<T> firstError = firstViolation.get();
      String violation = firstError.getPropertyPath().toString().concat(" ")
          .concat(firstError.getMessage());
      throw new BadResponseException(violation);
    }
  }
}
