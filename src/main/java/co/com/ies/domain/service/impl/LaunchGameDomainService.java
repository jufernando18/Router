package co.com.ies.domain.service.impl;

import co.com.ies.domain.enumeration.Key;
import co.com.ies.domain.enumeration.Message;
import co.com.ies.domain.enumeration.TransType;
import co.com.ies.domain.service.GeneralMethod;
import co.com.ies.domain.service.ILaunchGameDomainService;
import co.com.ies.service.dto.OperatorModuleDto;
import co.com.ies.service.dto.operator.LaunchGameInDto;
import co.com.ies.service.dto.operator.LaunchGameOutDto;
import co.com.ies.service.dto.sub.AccountDto;
import co.com.ies.service.dto.sub.StatusDto;
import co.com.ies.service.error.BadRequestException;
import co.com.ies.service.error.OperatorModuleDataException;
import co.com.ies.service.error.OperatorModuleException;

import java.util.HashMap;
import java.util.Map;

public abstract class LaunchGameDomainService extends GeneralMethod
    implements ILaunchGameDomainService {

  /**
   * Se verifican los datos de importancia.
   * 
   * @param operatorInDto información que entrega el operador
   * @return true Ok, false no Ok
   * @throws BadRequestException Excepción que se lanza para datos erróneos
   */
  public boolean isOkOperatorInData(LaunchGameInDto operatorInDto)
      throws BadRequestException {
    getLogger().debug("isOkOperatorInData|");
    getLogger().debug("{}", operatorInDto);
    ifNullLaunchRequestException(operatorInDto, Message.OPERATOR_REQUEST_NULL_ERROR);
    if (operatorInDto.isEmpty()) {
      ifNullLaunchRequestException(null, Message.OPERATOR_REQUEST_EMPTY_ERROR);
    }
    final AccountDto account = operatorInDto.getAccount();
    final String userName = (account == null) ? null : account.getUserName();
    final String password = (account == null) ? null : account.getPassword();
    ifNullOrBlankLaunchRequestException(userName, Message.USER_NAME_ERROR);
    ifNullOrBlankLaunchRequestException(password, Message.PASSWORD_ERROR);
    
    getLogger().debug("{}", operatorInDto);
    return true;
  }

  /**
   * Se verifican los datos de importancia.
   * 
   * @param operatorModuleInDto información que entrega operatorModule
   * @return true Ok, false no Ok
   * @throws OperatorModuleDataException Excepción que se lanza para datos erróneos
   */
  public boolean isOkOperatorModuleInData(OperatorModuleDto operatorModuleInDto)
      throws OperatorModuleDataException {
    getLogger().debug("isOkOperatorModuleInData|");
    ifNullLaunchResponseDataException(operatorModuleInDto,
        Message.TRANSACTION_NULL_ERROR);
    final String token = operatorModuleInDto.getToken();
    final String url = operatorModuleInDto.getUrl();
    if (operatorModuleInDto.isEmpty()) {
      ifNullLaunchResponseDataException(null, Message.TRANSACTION_EMPTY_ERROR);
    }
    ifNullOrBlankLaunchResponseDataException(token, Message.TOKEN_ERROR);
    ifNullOrBlankLaunchResponseDataException(url, Message.URL_ERROR);

    getLogger().debug("{}", operatorModuleInDto);
    return true;
  }

  /**
   * Convierte el Dto de operadorIn a operatorModuleOut.
   * 
   * @param operatorInDto información que entrega el operador
   * @return
   */
  public OperatorModuleDto operatorInToOperatorModuleOut(
      LaunchGameInDto operatorInDto) {
    getLogger().debug("operatorInToOperatorModuleOut|");
    Map<String, Object> body = new HashMap<>();
    body.put(Key.GAME_CODE.getKey(), operatorInDto.getGameCode());
    body.put(Key.PLATFORM.getKey(), operatorInDto.getPlatform());
    body.put(Key.CURRENCY_CODE.getKey(), operatorInDto.getCurrencyCode());
    body.put(Key.LANGUAGE_CODE.getKey(), operatorInDto.getLanguageCode());
    body.put(Key.PLAYER_IP.getKey(), operatorInDto.getPlayerIp());
    body.put(Key.PLAYER_ID.getKey(), operatorInDto.getPlayerId());
    body.put(Key.COUNTRY_CODE.getKey(), operatorInDto.getCountryCode());
    body.put(Key.TOTAL_BALANCE.getKey(), operatorInDto.getTotalBalance());
    body.put(Key.USER_NAME.getKey(), operatorInDto.getAccount().getUserName());
    body.put(Key.PASSWORD.getKey(), operatorInDto.getAccount().getPassword());
    OperatorModuleDto operatorModuleOutDto = new OperatorModuleDto()
        .setOperationType(TransType.CREATE_TOKEN)
        .setToken(null)
        .setBody(body);
    getLogger().debug("{}", operatorModuleOutDto);
    return operatorModuleOutDto;
  }

  /**
   * Convierte el Dto operatorModuleIn a OperadorOut.
   * 
   * @param operatorModuleInDto información que entrega operatorModule
   * @return
   */
  public LaunchGameOutDto operatorModuleInToOperatorOut(
      OperatorModuleDto operatorModuleInDto) {
    getLogger().debug("operatorModuleInToOperatorOut|");
    LaunchGameOutDto operatorOutDto = new LaunchGameOutDto()
        .setUrl(
            operatorModuleInDto.getUrl()
                .concat("?token=")
                .concat(operatorModuleInDto.getToken()))
        .setStatus(new StatusDto()
            .setErrorCode(Message.SUCCESS.getCode())
            .setErrorMsg(Message.SUCCESS.getMessage()));
    getLogger().debug("{}", operatorOutDto);
    return operatorOutDto;
  }

  /**
   * Hace una petición a operatorModule con los parametros que estableció el operador para que le
   * otorgue unas credenciales de ingreso a un juego.
   * 
   * @param operatorModuleInDto información que se entrega a operatorModule
   * @return información que se recibe de transacción
   * @throws OperatorModuleException excepción en el proceso de la petición a transaccion
   */
  public abstract OperatorModuleDto getGameToken(OperatorModuleDto operatorModuleInDto)
      throws OperatorModuleException;
}
