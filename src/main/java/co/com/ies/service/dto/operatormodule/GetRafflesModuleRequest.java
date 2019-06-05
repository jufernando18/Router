package co.com.ies.service.dto.operatormodule;

import co.com.ies.service.dto.operatormodule.GetRafflesModuleRequest;
import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;

public class GetRafflesModuleRequest {

  @NotNull
  private AccountDto account;

  public GetRafflesModuleRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public GetRafflesModuleRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  @Override
  public String toString() {
    return "GetRafflesModuleRequest [account=" + account + "]";
  }
}
