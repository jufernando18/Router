package co.com.ies.service.error;

import co.com.ies.domain.enumeration.Message;

public class OperatorModuleDataException extends Exception {

  /**
   * Error que se lanza cuando los datos que retorna Transaction no corresponden a los esperados.
   */
  private static final long serialVersionUID = 1L;

  public OperatorModuleDataException() {
    super(Message.BAD_RESPONSE_TRANSACTION.getMessage());
  }

  public OperatorModuleDataException(String msg) {
    super(msg);
  }
}
