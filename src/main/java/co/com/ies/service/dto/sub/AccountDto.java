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
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((password == null) ? 0 : password.hashCode());
    result = prime * result + ((userName == null) ? 0 : userName.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    AccountDto other = (AccountDto) obj;
    if (password == null) {
      if (other.password != null) {
        return false;
      }
    } else if (!password.equals(other.password)) {
      return false;
    }
    if (userName == null) {
      if (other.userName != null) {
        return false;
      }
    } else if (!userName.equals(other.userName)) {
      return false;
    }
    return true;
  }

  public boolean isEmpty() {
    AccountDto o = new AccountDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "Account [userName=" + userName + ", password=" + password + "]";
  }
}
