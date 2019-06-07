package co.com.ies.service.dto.operator;

import co.com.ies.service.dto.sub.Raffle;
import co.com.ies.service.dto.sub.StatusDto;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRafflesResponse {
  
  @NotNull
  private List<Raffle> raffles;
  @NotNull
  private StatusDto status;

  public GetRafflesResponse() {
    super();
  }

  public List<Raffle> getRaffles() {
    return raffles;
  }

  public GetRafflesResponse setRaffles(List<Raffle> raffles) {
    this.raffles = raffles;
    return this;
  }

  public StatusDto getStatus() {
    return status;
  }

  public GetRafflesResponse setStatus(StatusDto status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    return "GetRafflesResponse [raffles=" + raffles + ", status=" + status + "]";
  }

}
