package co.com.ies;

import co.com.ies.domain.enumeration.Message;
import co.com.ies.service.LaunchGameService;
import co.com.ies.service.ExternalOperatorService;
import co.com.ies.service.dto.operator.GetAllRafflesRequest;
import co.com.ies.service.dto.operator.GetAllRafflesResponse;
import co.com.ies.service.dto.operator.GetRafflesRequest;
import co.com.ies.service.dto.operator.GetRafflesResponse;
import co.com.ies.service.dto.operator.GetRoomsRequest;
import co.com.ies.service.dto.operator.GetRoomsResponse;
import co.com.ies.service.dto.operator.LaunchGameRequest;
import co.com.ies.service.dto.operator.LaunchGameResponse;
import co.com.ies.service.dto.sub.StatusDto;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ExternalOperatorController {

  @Autowired
  LaunchGameService launchGameService;

  @Autowired
  ExternalOperatorService operatorService;

  /**
   * Para obtener url y token de acceso aun juego.
   * 
   * @param request parámetros descritos en la documentación del api
   * @return url y token de acceso
   */
  @PostMapping("/launchgame")
  @ResponseBody
  public LaunchGameResponse launchgame(@Valid @RequestBody LaunchGameRequest request,
      Errors errors) {
    System.out.println("Se capturó el error");
    if (errors.hasErrors()) {
      FieldError fieldError = errors.getFieldError();
      String errorMsg = fieldError.getField().concat(" ").concat(fieldError.getDefaultMessage());
      return new LaunchGameResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(errorMsg));
    }
    return operatorService.getGame(request);
    // return launchGameService.getGame(request);
  }

  /**
   * Para consultar salas tipo bingo disponibles de un operador.
   * 
   * @param request credenciales y/o token
   * @return salas disponibles
   */
  @PostMapping("/bingo/getrooms")
  @ResponseBody
  public GetRoomsResponse getBingoRooms(@Valid @RequestBody GetRoomsRequest request,
      Errors errors) {
    if (errors.hasErrors()) {
      FieldError fieldError = errors.getFieldError();
      String errorMsg = fieldError.getField().concat(" ").concat(fieldError.getDefaultMessage());
      return new GetRoomsResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(errorMsg));
    }
    return operatorService.getRooms(request);
  }

  /**
   * Para consultar los sorteos pendientes de una sala tipo bingo de un operador.
   * 
   * @param request credenciales y/o token
   * @return información de sorteos disponibles de una sala
   */
  @PostMapping("/bingo/getraffles")
  @ResponseBody
  public GetRafflesResponse getBingoRaffles(@Valid @RequestBody GetRafflesRequest request,
      Errors errors) {
    if (errors.hasErrors()) {
      FieldError fieldError = errors.getFieldError();
      String errorMsg = fieldError.getField().concat(" ").concat(fieldError.getDefaultMessage());
      return new GetRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(errorMsg));
    }
    return operatorService.getRaffles(request);
  }

  /**
   * Para consultar la información de salas y/o sorteos tipo bingo programados de un operador.
   * 
   * @param request credenciales y/o token
   * @return información de salas y/o sorteos programados
   */
  @PostMapping("/bingo/getallraffles")
  @ResponseBody
  public GetAllRafflesResponse getAllBingoRaffles(@Valid @RequestBody GetAllRafflesRequest request,
      Errors errors) {
    if (errors.hasErrors()) {
      FieldError fieldError = errors.getFieldError();
      String errorMsg = fieldError.getField().concat(" ").concat(fieldError.getDefaultMessage());
      return new GetAllRafflesResponse().setStatus(new StatusDto()
          .setErrorCode(Message.BAD_REQUEST_OPERATOR.getCode()).setErrorMsg(errorMsg));
    }
    return operatorService.getAllRaffles(request);
  }
}
