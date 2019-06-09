package co.com.ies.service.dto.operatormodule;

import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;

public class GetAllRafflesModuleRequest {

  @NotNull
  private AccountDto account;

  public GetAllRafflesModuleRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public GetAllRafflesModuleRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  @Override
  public String toString() {
    return "GetAllRafflesRequest [account=" + account + "]";
  }
}
