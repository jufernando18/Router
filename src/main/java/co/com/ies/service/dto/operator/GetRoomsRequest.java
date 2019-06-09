package co.com.ies.service.dto.operator;

import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;

public class GetRoomsRequest {

  @NotNull
  private AccountDto account;

  public GetRoomsRequest() {
    super();
  }

  public AccountDto getAccount() {
    return account;
  }

  public GetRoomsRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  @Override
  public String toString() {
    return "GetRoomsRequest [account=" + account + "]";
  }
  
  
}
