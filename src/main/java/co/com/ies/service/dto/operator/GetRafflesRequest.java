package co.com.ies.service.dto.operator;

import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class GetRafflesRequest {

  @NotNull
  private AccountDto account;
  @NotNull
  @PositiveOrZero
  private Long roomId;

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

  public Long getRoom() {
    return roomId;
  }

  public void setRoom(Long roomId) {
    this.roomId = roomId;
  }

  @Override
  public String toString() {
    return "GetRafflesRequest [account=" + account + ", roomId=" + roomId + "]";
  }

}
