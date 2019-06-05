package co.com.ies.service.impl;

import co.com.ies.domain.enumeration.Url;
import co.com.ies.service.OperatorService;
import co.com.ies.service.dto.operator.GetAllRafflesRequest;
import co.com.ies.service.dto.operator.GetAllRafflesResponse;
import co.com.ies.service.dto.operator.GetRafflesRequest;
import co.com.ies.service.dto.operator.GetRafflesResponse;
import co.com.ies.service.dto.operator.GetRoomsRequest;
import co.com.ies.service.dto.operator.GetRoomsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OperatorServiceImpl implements OperatorService {

  @Autowired
  RestTemplate restTemplate;

  @Override
  public GetRoomsResponse getRooms(GetRoomsRequest request) {
    final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl().concat(Url.GET_ROOMS.getUrl());
    HttpEntity<GetRoomsRequest> requestModule = new HttpEntity<>(request);
    return restTemplate.postForObject(endpoint.toLowerCase(), requestModule,
        GetRoomsResponse.class);
  }

  @Override
  public GetRafflesResponse getRaffles(GetRafflesRequest request) {
    final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl().concat(Url.GET_RAFFLES.getUrl());
    HttpEntity<GetRafflesRequest> requestModule = new HttpEntity<>(request);
    return restTemplate.postForObject(endpoint.toLowerCase(), requestModule,
        GetRafflesResponse.class);
  }

  @Override
  public GetAllRafflesResponse getAllRaffles(GetAllRafflesRequest request) {
    final String endpoint = Url.OPERATOR_MODULE_ENDPOINT.getUrl()
        .concat(Url.GET_ALL_RAFFLES.getUrl());
    HttpEntity<GetAllRafflesRequest> requestModule = new HttpEntity<>(request);
    return restTemplate.postForObject(endpoint.toLowerCase(), requestModule,
        GetAllRafflesResponse.class);
  }

}
