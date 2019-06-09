package co.com.ies.domain.service.impl;

import co.com.ies.domain.enumeration.Message;
import co.com.ies.domain.service.IOperatorDomainService;
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

public abstract class OperatorDomainService implements IOperatorDomainService {
  /**
   * .
   * 
   * @param response .
   * @return .
   * @throws BadResponseException .
   */
  public LaunchGameResponse moduleToOperatorLaunchGameResponse(LaunchGameModuleResponse response)
      throws BadResponseException {
    validateResponseDto(response);
    return new LaunchGameResponse()
        .setUrl(response.getUrl().concat("?token=").concat(response.getToken()))
        .setStatus(new StatusDto().setErrorCode(Message.SUCCESS.getCode())
            .setErrorMsg(Message.SUCCESS.getMessage()));
  }

  /**
   * .
   * 
   * @param request .
   * @return .
   * @throws BadRequestException .
   */
  public LaunchGameModuleRequest operatorToModuleLaunchGameRequest(LaunchGameRequest request)
      throws BadRequestException {
    validateRequestDto(request);
    validateRequestDto(request.getAccount());
    return new LaunchGameModuleRequest().setTotalBalance(request.getTotalBalance())
        .setCountryCode(request.getCountryCode()).setCurrencyCode(request.getCurrencyCode())
        .setGameCode(request.getGameCode()).setLanguageCode(request.getLanguageCode())
        .setPlatform(request.getPlatform()).setPlayerId(request.getPlayerId())
        .setPlayerIp(request.getPlayerIp()).setAccount(request.getAccount());
  }

  /**
   * .
   * 
   * @param response .
   * @return .
   * @throws BadResponseException .
   */
  public GetRoomsResponse moduleToOperatorRoomsResponse(GetRoomsModuleResponse response)
      throws BadResponseException {
    validateResponseDto(response);
    return new GetRoomsResponse().setRooms(response.getRooms()).setStatus(new StatusDto()
        .setErrorCode(Message.SUCCESS.getCode()).setErrorMsg(Message.SUCCESS.getMessage()));
  }

  /**
   * .
   * 
   * @param request .
   * @return .
   * @throws BadRequestException .
   */
  public GetRoomsModuleRequest operatorToModuleRoomsRequest(GetRoomsRequest request)
      throws BadRequestException {
    validateRequestDto(request);
    validateRequestDto(request.getAccount());
    return new GetRoomsModuleRequest().setAccount(request.getAccount());
  }

  /**
   * .
   * 
   * @param response .
   * @return .
   * @throws BadResponseException .
   */
  public GetRafflesResponse moduleToOperatorRafflesResponse(GetRafflesModuleResponse response)
      throws BadResponseException {
    validateResponseDto(response);
    return new GetRafflesResponse().setRaffles(response.getRaffles()).setStatus(new StatusDto()
        .setErrorCode(Message.SUCCESS.getCode()).setErrorMsg(Message.SUCCESS.getMessage()));
  }

  /**
   * .
   * 
   * @param request .
   * @return .
   * @throws BadRequestException .
   */
  public GetRafflesModuleRequest operatorToModuleRafflesRequest(GetRafflesRequest request)
      throws BadRequestException {
    validateRequestDto(request);
    validateRequestDto(request.getAccount());
    return new GetRafflesModuleRequest().setRoom(request.getRoom())
        .setAccount(request.getAccount());
  }

  /**
   * .
   * 
   * @param response .
   * @return .
   * @throws BadResponseException .
   */
  public GetAllRafflesResponse moduleToOperatorAllRafflesResponse(
      GetAllRafflesModuleResponse response) throws BadResponseException {
    validateResponseDto(response);
    return new GetAllRafflesResponse().setAllRaffles(response.getAllRaffles())
        .setStatus(new StatusDto().setErrorCode(Message.SUCCESS.getCode())
            .setErrorMsg(Message.SUCCESS.getMessage()));
  }

  /**
   * .
   * 
   * @param request .
   * @return .
   * @throws BadRequestException .
   */
  public GetAllRafflesModuleRequest operatorToModuleAllRafflesRequest(GetAllRafflesRequest request)
      throws BadRequestException {
    validateRequestDto(request);
    validateRequestDto(request.getAccount());
    return new GetAllRafflesModuleRequest().setAccount(request.getAccount());
  }

  public abstract <T> void validateRequestDto(T request) throws BadRequestException;

  public abstract <T> void validateResponseDto(T response) throws BadResponseException;
}
