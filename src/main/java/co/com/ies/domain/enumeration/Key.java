package co.com.ies.domain.enumeration;

public enum Key {
  USER("user"),
  USER_NAME("userName"),
  PASSWORD("password"),
  PASS("pass"),
  PLAYER_ID("playerId"),
  TOTAL_BALANCE("totalBalance"),
  HAS_ERROR("hasError"),
  ERROR_ID("errorId"),
  ERROR_DESCRIPTION("errorDescription"),
  PLATFORM_TRANSACTION_ID("platformTransactionId"),
  IES_TRANSACTION_ID("iesTransactionId"),
  IES_RELATED_TRANSACTION_ID("iesRelatedTransactionId"),
  GAME_CODE("gameCode"),
  PLATFORM("platform"),
  CURRENCY("currency"),
  CURRENCY_CODE("currencyCode"),
  LANGUAGE_CODE("languageCode"),
  PLAYER_IP("playerIp"),
  COUNTRY_CODE("countryCode"),
  DEBIT_AMOUNT("debitAmount"),
  CREDIT_AMOUNT("creditAmount"),
  ROUND_ID("roundId");
  

  private final String key;

  private Key(String key) {
    this.key = key;
  }
  
  public String getKey() {
    return key;
  }
}
