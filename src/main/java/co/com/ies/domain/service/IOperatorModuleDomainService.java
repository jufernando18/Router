package co.com.ies.domain.service;

import co.com.ies.service.dto.OperatorModuleDto;

import org.slf4j.Logger;

public interface IOperatorModuleDomainService {

  Logger getLogger();
  
  OperatorModuleDto getOperatorInfo(OperatorModuleDto credentials);
  
  OperatorModuleDto getRooms(OperatorModuleDto operator);
  
  OperatorModuleDto getRaffles(OperatorModuleDto roomAndOperator);
  
  OperatorModuleDto getGame(OperatorModuleDto launchingInfo);
}
