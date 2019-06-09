package co.com.ies.service;

import co.com.ies.domain.service.IRequestProcessorDomain;
import co.com.ies.service.dto.RequestDto;
import co.com.ies.service.dto.ResponseDto;
import co.com.ies.service.dto.operator.LaunchGameRequest;
import co.com.ies.service.dto.operator.LaunchGameResponse;

public interface RequestBingoProcessorService extends IRequestProcessorDomain {

  ResponseDto getOperatorInfo(RequestDto request);
  
  LaunchGameResponse launchGame(LaunchGameRequest request);
}
