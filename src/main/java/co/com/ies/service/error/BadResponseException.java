package co.com.ies.service.error;

import co.com.ies.domain.enumeration.Message;

public class BadResponseException extends Exception {

  /**
   * Error que se lanza si los datos que se esperan en el request del operador, no son los
   * correctos.
   */
  private static final long serialVersionUID = 1L;

  public BadResponseException() {
    super(Message.BAD_RESPONSE_OPERATOR.getMessage());
  }

  public BadResponseException(String msg) {
    super(msg);
  }
}
