package co.com.ies.domain.service.impl;

import co.com.ies.domain.service.IRequestProcessorDomain;
import co.com.ies.service.dto.OperatorModuleDto;
import co.com.ies.service.dto.RequestDto;
import co.com.ies.service.dto.ResponseDto;

public abstract class RequestProcessorDomain implements IRequestProcessorDomain {
  
  public abstract ResponseDto doOperatorModuleRequest(RequestDto request);
  
  public abstract ResponseDto doTransactionRequest(RequestDto request);
  
  public abstract ResponseDto doBingoRequest(RequestDto request);

  @Override
  public OperatorModuleDto toOperatorModuleRequest(RequestDto request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RequestDto toTransactionRequest(RequestDto request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isRegistered(RequestDto request) {
    // TODO Auto-generated method stub
    return false;
  }

}
