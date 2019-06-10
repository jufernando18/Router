package co.com.ies.service.dto.operatormodule;

import co.com.ies.service.dto.sub.AccountDto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class GetRafflesModuleRequest {

  @NotNull
  private AccountDto account;
  @NotNull
  @PositiveOrZero
  private Long roomId;

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

  public Long getRoomId() {
    return roomId;
  }

  public GetRafflesModuleRequest setRoomId(Long roomId) {
    this.roomId = roomId;
    return this;
  }

  @Override
  public String toString() {
    return "GetRafflesModuleRequest [account=" + account + ", roomId=" + roomId + "]";
  }


}
