package co.com.ies.service.dto.sub;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class StatusDto {
  
  @NotNull
  private Integer errorCode;
  @NotBlank
  private String errorMsg;

  public StatusDto() {
    super();
  }

  /**
   * Estado de una operación.
   * 
   * @param errorCode código de error
   * @param errorMsg  descripción del error
   */
  public StatusDto(Integer errorCode, String errorMsg) {
    super();
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }

  public Integer getErrorCode() {
    return errorCode;
  }

  public StatusDto setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public StatusDto setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  @Override
  public String toString() {
    return "StatusDto [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
  }
}
