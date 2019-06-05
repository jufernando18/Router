package co.com.ies.service.dto.operator;

import co.com.ies.service.dto.sub.Room;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRoomsResponse {
  
  @NotNull
  private List<Room> rooms;

  public GetRoomsResponse() {
    super();
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public GetRoomsResponse setRooms(List<Room> rooms) {
    this.rooms = rooms;
    return this;
  }

  @Override
  public String toString() {
    return "GetRoomsResponse [rooms=" + rooms + "]";
  }
}
