package co.com.ies.domain.enumeration;

public enum Message {
  BAD_REQUEST_OPERATOR("Bad request", 400),
  BAD_REQUEST_TRANSACTION("Bad request. Transaction", 400),
  BAD_RESPONSE_OPERATOR("Bad response. Operator", 500),
  BAD_RESPONSE_TRANSACTION("Bad response. Transaction", 500),
  INTERNAL_OPERATOR_ERROR("Ocurrió un error interno. Operador", 500),
  INTERNAL_TRANSACTION_ERROR("Ocurrió un error interno. Transaction", 500),
  INTERNAL_API_ERROR("Ocurrió un error interno", 500),
  OPERATOR_REQUEST_ERROR("Request must not be null or empty."),
  OPERATOR_REQUEST_NULL_ERROR("Request must not be null."),
  OPERATOR_RESPONSE_NULL_ERROR("Response must not be null."),
  OPERATOR_RESPONSE_ERROR("Response must not be null or empty."),
  OPERATOR_REQUEST_EMPTY_ERROR("Request must not be empty."),
  OPERATOR_RESPONSE_EMPTY_ERROR("Response must not be empty."),
  GAME_CODE_ERROR("The 'gameCode' parameter must not be null or empty."),
  USER_ERROR("The 'user' parameter must not be null or empty."),
  USER_NAME_ERROR("The 'userName' parameter must not be null or empty."),
  PASS_ERROR("The 'pass' parameter must not be null or empty."),
  PASSWORD_ERROR("The 'password' parameter must not be null or empty."),
  TOTAL_BALANCE_ERROR("The 'totalBalance' parameter must not be null or empty."),
  PLATFORM_ERROR("The 'platform' parameter must not be null, empty and not different than 0 or 1."),
  CURRENCY_CODE_ERROR(
      "The 'currencyCode' parameter must not be null or empty. 3 characters currency code."),
  CURRENCY_ERROR(
      "The 'currency' parameter must not be null or empty. 3 characters currency code."),
  LANGUAGE_CODE_ERROR(
      "The 'LanguageCode' parameter must not be null or empty. 2 character ISO code."),
  PLAYER_IP_ERROR("The 'PlayerIp' parameter must not be null or empty."),
  PLAYER_ID_ERROR("The 'PlayerId' parameter must not be null or empty."),
  COUNTRY_CODE_ERROR(
      "The 'CountryCode' parameter must not be null or empty. 3 characters Player country code."),
  ACCOUNT_ERROR("The 'Account' parameter must not be null or empty."),
  OPERATOR_URL_ERROR("The 'OperatorUrl' parameter must not be null or empty."),
  TRANSACTION_NULL_ERROR("En la respuesta de Transaction: es null."),
  TRANSACTION_EMPTY_ERROR("En la respuesta de Transaction: es empty."),
  TOKEN_ERROR("En la respuesta de Transaction: Token es null o blank."),
  BODY_ERROR("En la respuesta de Transaction: Body es null o empty."),
  URL_ERROR("En la respuesta de Transaction: Url es null o blank."),
  HAS_ERROR_ERROR(
      "The 'hasError' parameter must not be null, empty and not different than 0 or 1."),
  ERROR_ID_ERROR("The 'errorId' parameter must not be null or empty."),
  OPERATION_TYPE_ERROR("The 'operationType'  parameter must not be null or empty."),
  OPERATION_TYPE_MATCH_ERROR(
      "The 'operationType' parameter does not match any of the registered operations"),
  PLATFORM_TRANSACTION_ID_ERROR("The 'platformTransactionId' parameter must not be null or empty."),
  IES_TRANSACTION_ID_ERROR("The 'iesTransactionId' parameter must not be null or empty."),
  ROUND_ID_ERROR("The 'iesTransactionId' parameter must not be null or empty."),
  IES_RELATED_TRANSACTION_ID_ERROR(
      "The 'iesRelatedTransactionId' parameter must not be null or empty."),
  DEBIT_AMOUNT_ERROR("The 'debitAmount' parameter must not be null or empty."),
  CREDIT_AMOUNT_ERROR("The 'creditAmount' parameter must not be null or empty."),
  SUCCESS("Success", 0);
  private final String msg;
  private final Integer code;

  private Message(String msg) {
    this.msg = msg;
    this.code = null;
  }

  private Message(String msg, Integer code) {
    this.msg = msg;
    this.code = code;
  }

  public String getMessage() {
    return msg;
  }

  public Integer getCode() {
    return code;
  }
}
