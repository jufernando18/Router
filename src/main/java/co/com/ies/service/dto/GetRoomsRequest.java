package co.com.ies.service.dto;

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

  public void setAccount(AccountDto account) {
    this.account = account;
  }

  @Override
  public String toString() {
    return "GetRoomsRequest [account=" + account + "]";
  }
  
  
}
