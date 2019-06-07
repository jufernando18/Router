package co.com.ies.service.dto.operator;

import co.com.ies.service.dto.sub.RoomAndRaffle;
import co.com.ies.service.dto.sub.StatusDto;

import java.util.List;

public class GetAllRafflesResponse {

  private List<RoomAndRaffle> allRaffles;
  
  private StatusDto status;

  public GetAllRafflesResponse() {
    super();
  }

  public List<RoomAndRaffle> getAllRaffles() {
    return allRaffles;
  }

  public GetAllRafflesResponse setAllRaffles(List<RoomAndRaffle> allRaffles) {
    this.allRaffles = allRaffles;
    return this;
  }

  public StatusDto getStatus() {
    return status;
  }

  public GetAllRafflesResponse setStatus(StatusDto status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    return "GetAllRafflesResponse [allRaffles=" + allRaffles + ", status=" + status + "]";
  }

  
}
