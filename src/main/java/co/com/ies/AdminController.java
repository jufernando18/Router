package co.com.ies;

import co.com.ies.service.dto.RequestDto;
import co.com.ies.service.dto.ResponseDto;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server/admin")
public class AdminController {

  /**
   * TODO se debe habilitar solo para el usuario supremo de la plataforma.
   */
  @PostMapping("create/user")
  @ResponseBody
  public ResponseDto createUser(@Valid @RequestBody RequestDto request) {
    return new ResponseDto();
  }
  
  @PostMapping("get/user")
  @ResponseBody
  public ResponseDto getCreateRaffle(@Valid @RequestBody RequestDto request) {
    return new ResponseDto();
  }

  @PostMapping("edit/user")
  @ResponseBody
  public ResponseDto editUser(@Valid @RequestBody RequestDto request) {
    return new ResponseDto();
  }

  /**
   * TODO se debe habilitar solo para los usuarios administradores de los operadores y para el
   * usuario supremo.
   */
  @PostMapping("create/room")
  @ResponseBody
  public ResponseDto createRoom(@Valid @RequestBody RequestDto request) {
    return new ResponseDto();
  }

  @PostMapping("get/room")
  @ResponseBody
  public ResponseDto getRoom(@Valid @RequestBody RequestDto request) {
    return new ResponseDto();
  }
  
  @PostMapping("edit/room")
  @ResponseBody
  public ResponseDto editRoom(@Valid @RequestBody RequestDto request) {
    return new ResponseDto();
  }
  
  /**
   * TODO se debe habilitar solo para los usuarios administradores de los operadores y para el
   * usuario supremo.
   */
  @PostMapping("create/raffle")
  @ResponseBody
  public ResponseDto createRaffle(@Valid @RequestBody RequestDto request) {
    return new ResponseDto();
  }

  @PostMapping("get/raffle")
  @ResponseBody
  public ResponseDto getRaffle(@Valid @RequestBody RequestDto request) {
    return new ResponseDto();
  }

  @PostMapping("edit/raffle")
  @ResponseBody
  public ResponseDto editRaffle(@Valid @RequestBody RequestDto request) {
    return new ResponseDto();
  }
  
}
