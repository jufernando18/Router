package co.com.ies;

import co.com.ies.service.LaunchGameService;
import co.com.ies.service.OperatorModuleService;
import co.com.ies.service.dto.GetAllRafflesRequest;
import co.com.ies.service.dto.GetAllRafflesResponse;
import co.com.ies.service.dto.GetRafflesRequest;
import co.com.ies.service.dto.GetRafflesResponse;
import co.com.ies.service.dto.GetRoomsRequest;
import co.com.ies.service.dto.GetRoomsResponse;
import co.com.ies.service.dto.LaunchGameInDto;
import co.com.ies.service.dto.LaunchGameOutDto;
import co.com.ies.service.dto.RequestDto;
import co.com.ies.service.dto.ResponseDto;
import co.com.ies.service.dto.sub.Room;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class OperatorController {

  @Autowired
  LaunchGameService launchGameService;

  /**
   * Para obtener url y token de acceso aun juego.
   * 
   * @param request parámetros descritos en la documentación del api
   * @return url y token de acceso
   */
  @PostMapping("/launchgame")
  @ResponseBody
  public LaunchGameOutDto launchgame(@Valid @RequestBody LaunchGameInDto request) {
    return launchGameService.getGame(request);
  }

  /**
   * Para consultar salas tipo bingo disponibles de un operador.
   * 
   * @param request credenciales y/o token
   * @return salas disponibles
   */
  @PostMapping("/bingo/getrooms")
  @ResponseBody
  public GetRoomsResponse getBingoRooms(@Valid @RequestBody GetRoomsRequest request) {

    return new GetRoomsResponse();
  }

  /**
   * Para consultar los sorteos pendientes de una sala tipo bingo de un operador.
   * 
   * @param request credenciales y/o token
   * @return información de sorteos disponibles de una sala
   */
  @PostMapping("/bingo/getraffles")
  @ResponseBody
  public GetRafflesResponse getBingoRaffles(@Valid @RequestBody GetRafflesRequest request) {
    return new GetRafflesResponse();
  }

  /**
   * Para consultar la información de salas y/o sorteos tipo bingo programados de un operador.
   * 
   * @param request credenciales y/o token
   * @return información de salas y/o sorteos programados
   */
  @PostMapping("/bingo/getallraffles")
  @ResponseBody
  public GetAllRafflesResponse getAllBingoRaffles(
      @Valid @RequestBody GetAllRafflesRequest request) {
    return new GetAllRafflesResponse();
  }
}
