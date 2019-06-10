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
  public String toString() {
    return "LaunchGameInDto [gameCode=" + gameCode + ", platform=" + platform + ", currencyCode="
        + currencyCode + ", languageCode=" + languageCode + ", playerIp=" + playerIp + ", playerId="
        + playerId + ", countryCode=" + countryCode + ", totalBalance=" + totalBalance
        + ", account=" + account + "]";
  }

}
