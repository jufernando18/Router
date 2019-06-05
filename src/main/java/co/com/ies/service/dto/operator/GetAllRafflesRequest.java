package co.com.ies.service.dto.operator;

import co.com.ies.service.dto.operator.GetAllRafflesRequest;
import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;

public class GetAllRafflesRequest {

  @NotNull
  private AccountDto account;

  public GetAllRafflesRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public GetAllRafflesRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  @Override
  public String toString() {
    return "GetAllRafflesRequest [account=" + account + "]";
  }
  
}
