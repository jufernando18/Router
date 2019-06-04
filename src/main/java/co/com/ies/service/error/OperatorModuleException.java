package co.com.ies.service.error;

import co.com.ies.domain.enumeration.Message;

public class OperatorModuleException extends Exception {

  /**
   * Error que se lanza cuando hay un problema en la comunicación con Transaction.
   */
  private static final long serialVersionUID = 1L;

  public OperatorModuleException() {
    super(Message.INTERNAL_TRANSACTION_ERROR.getMessage());
  }
  
  public OperatorModuleException(String msg) {
    super(msg);
  }
}
