package co.com.ies.service.dto.operator;

import co.com.ies.service.dto.operator.GetRafflesRequest;
import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;

public class GetRafflesRequest {

  @NotNull
  private AccountDto account;

  public GetRafflesRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public GetRafflesRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  @Override
  public String toString() {
    return "GetRafflesRequest [account=" + account + "]";
  }
}
