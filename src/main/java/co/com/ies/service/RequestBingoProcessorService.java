package co.com.ies.service;

import co.com.ies.domain.service.IRequestProcessorDomain;
import co.com.ies.service.dto.LaunchGameInDto;
import co.com.ies.service.dto.LaunchGameOutDto;
import co.com.ies.service.dto.RequestDto;
import co.com.ies.service.dto.ResponseDto;

public interface RequestBingoProcessorService extends IRequestProcessorDomain {

  ResponseDto getOperatorInfo(RequestDto request);
  
  LaunchGameOutDto launchGame(LaunchGameInDto request);
}
