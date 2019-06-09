package co.com.ies.service;

import co.com.ies.domain.service.ILaunchGameDomainService;
import co.com.ies.service.dto.operator.LaunchGameRequest;
import co.com.ies.service.dto.operator.LaunchGameResponse;

public interface LaunchGameService extends ILaunchGameDomainService {
  LaunchGameResponse getGame(LaunchGameRequest launchGameOperatorInDto);
}
