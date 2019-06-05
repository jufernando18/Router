package co.com.ies.service.dto.operator;

import co.com.ies.service.dto.sub.Raffle;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRafflesResponse {
  
  @NotNull
  private List<Raffle> raffles;

  public GetRafflesResponse() {
    super();
  }

  public List<Raffle> getRaffles() {
    return raffles;
  }

  public void setRaffles(List<Raffle> raffles) {
    this.raffles = raffles;
  }

  @Override
  public String toString() {
    return "GetRafflesResponse [raffles=" + raffles + "]";
  }
}
