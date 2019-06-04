package co.com.ies.service.impl;

import co.com.ies.domain.service.impl.RequestProcessorDomain;
import co.com.ies.service.RequestBingoProcessorService;
import co.com.ies.service.dto.LaunchGameInDto;
import co.com.ies.service.dto.LaunchGameOutDto;
import co.com.ies.service.dto.RequestDto;
import co.com.ies.service.dto.ResponseDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RequestBingoProcessorServiceImpl extends RequestProcessorDomain
    implements RequestBingoProcessorService {

  @Autowired
  private RestTemplate restTemplate;

  /**
   * Es la función encargada de realizar la validación de los datos, de realizar las consultas y
   * transformaciones necesarias en los datos para al final retornar salas y/o sorteos.
   */
  @Override
  public ResponseDto getOperatorInfo(RequestDto request) {
    // TODO Auto-generated method stub
    return null;
  }

  public ResponseDto doCacheRequest(RequestDto request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseDto doTransactionRequest(RequestDto request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseDto doBingoRequest(RequestDto request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public LaunchGameOutDto launchGame(LaunchGameInDto request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseDto doOperatorModuleRequest(RequestDto request) {
    // TODO Auto-generated method stub
    return null;
  }

}
