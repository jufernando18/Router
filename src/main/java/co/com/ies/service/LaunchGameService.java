package co.com.ies.service;

import co.com.ies.domain.service.ILaunchGameDomainService;
import co.com.ies.service.dto.LaunchGameInDto;
import co.com.ies.service.dto.LaunchGameOutDto;

public interface LaunchGameService extends ILaunchGameDomainService {
  LaunchGameOutDto getGame(LaunchGameInDto launchGameOperatorInDto);
}
