package co.com.ies.service.error;

import co.com.ies.domain.enumeration.Message;

public class OperatorException extends Exception {

  /**
   * Error que se lanza cuando hay un problema en la comunicación con Operator.
   */
  private static final long serialVersionUID = 1L;

  public OperatorException() {
    super(Message.INTERNAL_OPERATOR_ERROR.getMessage());
  }
  
  public OperatorException(String msg) {
    super(msg);
  }
}
