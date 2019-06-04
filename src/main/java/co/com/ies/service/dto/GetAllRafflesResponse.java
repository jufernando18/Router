package co.com.ies.service.dto;

import co.com.ies.service.dto.sub.RoomAndRaffle;

import java.util.List;

public class GetAllRafflesResponse {

  private List<RoomAndRaffle> allRaffles;

  public GetAllRafflesResponse() {
    super();
  }

  public List<RoomAndRaffle> getAllRaffles() {
    return allRaffles;
  }

  public void setAllRaffles(List<RoomAndRaffle> allRaffles) {
    this.allRaffles = allRaffles;
  }

  @Override
  public String toString() {
    return "GetAllRafflesResponse [allRaffles=" + allRaffles + "]";
  }
  
  
}
