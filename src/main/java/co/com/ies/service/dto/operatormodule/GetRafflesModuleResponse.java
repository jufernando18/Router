package co.com.ies.service.dto.operatormodule;

import co.com.ies.service.dto.sub.Raffle;

import java.util.List;

import javax.validation.constraints.NotNull;

public class GetRafflesModuleResponse {

  @NotNull
  private List<Raffle> raffles;

  public GetRafflesModuleResponse() {
    super();
  }

  public List<Raffle> getRaffles() {
    return raffles;
  }

  public GetRafflesModuleResponse setRaffles(List<Raffle> raffles) {
    this.raffles = raffles;
    return this;
  }

  @Override
  public String toString() {
    return "GetRafflesModuleResponse [raffles=" + raffles + "]";
  }
}
