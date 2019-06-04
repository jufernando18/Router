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
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((errorCode == null) ? 0 : errorCode.hashCode());
    result = prime * result + ((errorMsg == null) ? 0 : errorMsg.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    StatusDto other = (StatusDto) obj;
    if (errorCode == null) {
      if (other.errorCode != null) {
        return false;
      }
    } else if (!errorCode.equals(other.errorCode)) {
      return false;
    }
    if (errorMsg == null) {
      if (other.errorMsg != null) {
        return false;
      }
    } else if (!errorMsg.equals(other.errorMsg)) {
      return false;
    }
    return true;
  }

  public boolean isEmpty() {
    StatusDto o = new StatusDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "StatusDto [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
  }
}
