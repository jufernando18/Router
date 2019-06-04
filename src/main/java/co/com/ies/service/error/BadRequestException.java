package co.com.ies.service.error;

import co.com.ies.domain.enumeration.Message;

public class BadRequestException extends Exception {

  /**
   * Error que se lanza si los datos que se esperan en el request del operador, no son los
   * correctos.
   */
  private static final long serialVersionUID = 1L;

  public BadRequestException() {
    super(Message.BAD_REQUEST_OPERATOR.getMessage());
  }

  public BadRequestException(String msg) {
    super(msg);
  }
}
