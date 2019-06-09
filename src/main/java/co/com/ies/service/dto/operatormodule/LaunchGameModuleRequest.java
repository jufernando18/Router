package co.com.ies.service.dto.operatormodule;

import co.com.ies.service.dto.sub.AccountDto;

import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Modelo de la información que se espera del operador.
 * 
 * @author Fernando Echavarria
 *
 */

public class LaunchGameModuleRequest {

  @NotBlank
  private String gameCode; // código del juego que solicita
  @NotNull
  @Min(0)
  @Max(1)
  private Integer platform; // plataforma
  @NotBlank
  @Size(min = 3, max = 3)
  private String currencyCode; // moneda. 3 caracteres. En el caso de pesos colombianos, COP
  @NotBlank
  @Size(min = 2, max = 2)
  private String languageCode; // lenguaje. 2 caracteres según código ISO
  @NotBlank
  private String playerIp; // IP del jugador
  @NotBlank
  private String playerId; // ID del jugador
  @NotBlank
  @Size(min = 3, max = 3)
  private String countryCode; // pais del jugador. 3 caracteres
  @NotNull
  private BigDecimal totalBalance; // valor o estado monetario de la cuenta.
  @NotNull
  private AccountDto account; // {userName,password} credenciales de acceso

  public LaunchGameModuleRequest() {
    super();
  }

  public String getGameCode() {
    return gameCode;
  }

  public LaunchGameModuleRequest setGameCode(String gameCode) {
    this.gameCode = gameCode;
    return this;
  }

  public Integer getPlatform() {
    return platform;
  }

  public LaunchGameModuleRequest setPlatform(Integer platform) {
    this.platform = platform;
    return this;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public LaunchGameModuleRequest setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  public String getLanguageCode() {
    return languageCode;
  }

  public LaunchGameModuleRequest setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  public String getPlayerIp() {
    return playerIp;
  }

  public LaunchGameModuleRequest setPlayerIp(String playerIp) {
    this.playerIp = playerIp;
    return this;
  }

  public String getPlayerId() {
    return playerId;
  }

  public LaunchGameModuleRequest setPlayerId(String playerId) {
    this.playerId = playerId;
    return this;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public LaunchGameModuleRequest setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public BigDecimal getTotalBalance() {
    return totalBalance;
  }

  public LaunchGameModuleRequest setTotalBalance(BigDecimal totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  public AccountDto getAccount() {
    return account;
  }

  public LaunchGameModuleRequest setAccount(AccountDto account) {
    this.account = account;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((account == null) ? 0 : account.hashCode());
    result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
    result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());
    result = prime * result + ((gameCode == null) ? 0 : gameCode.hashCode());
    result = prime * result + ((languageCode == null) ? 0 : languageCode.hashCode());
    result = prime * result + ((platform == null) ? 0 : platform.hashCode());
    result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
    result = prime * result + ((playerIp == null) ? 0 : playerIp.hashCode());
    result = prime * result + ((totalBalance == null) ? 0 : totalBalance.hashCode());
    return result;
  }

  @SuppressWarnings("all")
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
    LaunchGameModuleRequest other = (LaunchGameModuleRequest) obj;
    if (account == null) {
      if (other.account != null) {
        return false;
      }
    } else if (!account.equals(other.account)) {
      return false;
    }
    if (countryCode == null) {
      if (other.countryCode != null) {
        return false;
      }
    } else if (!countryCode.equals(other.countryCode)) {
      return false;
    }
    if (currencyCode == null) {
      if (other.currencyCode != null) {
        return false;
      }
    } else if (!currencyCode.equals(other.currencyCode)) {
      return false;
    }
    if (gameCode == null) {
      if (other.gameCode != null) {
        return false;
      }
    } else if (!gameCode.equals(other.gameCode)) {
      return false;
    }
    if (languageCode == null) {
      if (other.languageCode != null) {
        return false;
      }
    } else if (!languageCode.equals(other.languageCode)) {
      return false;
    }
    if (platform == null) {
      if (other.platform != null) {
        return false;
      }
    } else if (!platform.equals(other.platform)) {
      return false;
    }
    if (playerId == null) {
      if (other.playerId != null) {
        return false;
      }
    } else if (!playerId.equals(other.playerId)) {
      return false;
    }
    if (playerIp == null) {
      if (other.playerIp != null) {
        return false;
      }
    } else if (!playerIp.equals(other.playerIp)) {
      return false;
    }
    if (totalBalance == null) {
      if (other.totalBalance != null) {
        return false;
      }
    } else if (!totalBalance.equals(other.totalBalance)) {
      return false;
    }
    return true;
  }

  /**
   * .
   * 
   * @return .
   */
  public boolean isEmpty() {
    LaunchGameModuleRequest o = new LaunchGameModuleRequest();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "LaunchGameInDto [gameCode=" + gameCode + ", platform=" + platform + ", currencyCode="
        + currencyCode + ", languageCode=" + languageCode + ", playerIp=" + playerIp + ", playerId="
        + playerId + ", countryCode=" + countryCode + ", totalBalance=" + totalBalance
        + ", account=" + account + "]";
  }

}
