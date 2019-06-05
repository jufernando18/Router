package co.com.ies.service;

import co.com.ies.service.dto.operator.GetAllRafflesRequest;
import co.com.ies.service.dto.operator.GetAllRafflesResponse;
import co.com.ies.service.dto.operator.GetRafflesRequest;
import co.com.ies.service.dto.operator.GetRafflesResponse;
import co.com.ies.service.dto.operator.GetRoomsRequest;
import co.com.ies.service.dto.operator.GetRoomsResponse;

public interface OperatorService {

  GetRoomsResponse getRooms(GetRoomsRequest request);

  GetRafflesResponse getRaffles(GetRafflesRequest request);

  GetAllRafflesResponse getAllRaffles(GetAllRafflesRequest request);
}
