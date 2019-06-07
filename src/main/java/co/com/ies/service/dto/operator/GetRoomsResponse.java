package co.com.ies.service.dto.operator;

import co.com.ies.service.dto.sub.RoomAndRaffleResume;
import co.com.ies.service.dto.sub.StatusDto;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRoomsResponse {
  
  @NotNull
  private List<RoomAndRaffleResume> rooms;
  @NotNull
  private StatusDto status;

  public GetRoomsResponse() {
    super();
  }

  public List<RoomAndRaffleResume> getRooms() {
    return rooms;
  }

  public GetRoomsResponse setRooms(List<RoomAndRaffleResume> rooms) {
    this.rooms = rooms;
    return this;
  }

  public StatusDto getStatus() {
    return status;
  }

  public GetRoomsResponse setStatus(StatusDto status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    return "GetRoomsResponse [rooms=" + rooms + ", status=" + status + "]";
  }


}
