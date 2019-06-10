package co.com.ies.service.dto.sub;

import javax.validation.constraints.NotBlank;

public class AccountDto {
  @NotBlank
  private String userName;
  @NotBlank
  private String password;

  public AccountDto() {
    super();
  }

  /**
   * Modelo de credenciales.
   * 
   * @param userName usuario
   * @param password contraseña
   */
  public AccountDto(String userName, String password) {
    super();
    this.userName = userName;
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }

  public AccountDto setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public AccountDto setPassword(String password) {
    this.password = password;
    return this;
  }

  @Override
  public String toString() {
    return "Account [userName=" + userName + ", password=" + password + "]";
  }
}
