package co.com.ies.service.dto.operatormodule;

import co.com.ies.service.dto.sub.Room;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRoomsModuleResponse {
  
  @NotNull
  private List<Room> rooms;

  public GetRoomsModuleResponse() {
    super();
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public GetRoomsModuleResponse setRooms(List<Room> rooms) {
    this.rooms = rooms;
    return this;
  }

  @Override
  public String toString() {
    return "GetRoomsResponse [rooms=" + rooms + "]";
  }
}
