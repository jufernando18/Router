package co.com.ies.domain.service;

import co.com.ies.service.dto.OperatorModuleDto;
import co.com.ies.service.dto.RequestDto;
import co.com.ies.service.dto.ResponseDto;

public interface IRequestProcessorDomain {
  
  boolean isRegistered(RequestDto request);
  
  OperatorModuleDto toOperatorModuleRequest(RequestDto request);
  
  RequestDto toTransactionRequest(RequestDto request);
  
  ResponseDto doOperatorModuleRequest(RequestDto request);
  
  ResponseDto doTransactionRequest(RequestDto request);
  
  ResponseDto doBingoRequest(RequestDto request);
  
  
}
