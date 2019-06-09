package co.com.ies.service.dto.operatormodule;

import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;

public class GetRoomsModuleRequest {

  @NotNull
  private AccountDto account;

  public GetRoomsModuleRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public GetRoomsModuleRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  @Override
  public String toString() {
    return "GetRoomsRequest [account=" + account + "]";
  }
  
  
}
