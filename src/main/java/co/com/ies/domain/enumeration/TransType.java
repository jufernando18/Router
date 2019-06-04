package co.com.ies.domain.enumeration;

/**
 * The TransType enumeration.
 */
public enum TransType {
  /**
   * Crear token de acceso al juego.
   */
  CREATE_TOKEN,
  /**
   * Disminucion del balance por venta (apuesta, recarga).
   */
  AUTHENTICATE,  
  /**
   * Disminucion del balance por venta (apuesta, recarga).
   */  
  DEBIT_X_SALE,
  /**
   * Disminucion del balance por salida de dinero (pago).
   */
  DEBIT_X_OUT,
  /**
   * Aumento del balance por venta (win).
   */
  CREDIT_X_SALE,
  /**
   * Aumento del balance por ingreso de dinero.
   */
  CREDIT_X_IN,
  /**
   * Aumento de balance pero no en bill sino en bonus.
   */
  CREDIT_X_BONUS,
  /**
   * aumento de los contadores en caso de error, disminuye coin in.
   */
  REFUND,
  /**
   * trae los el balance actual.
   */
  GET_BALANCE,
  /**
   * Finaliza la session.
   */
  END_SESSION;

}
