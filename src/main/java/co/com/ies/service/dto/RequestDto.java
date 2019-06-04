package co.com.ies.service.dto;

import javax.validation.constraints.NotBlank;

public class RequestDto {

  @NotBlank
  private String operatorUrl;

  public RequestDto() {
    super();
  }

  public String getOperatorUrl() {
    return operatorUrl;
  }

  public RequestDto setOperatorUrl(String operatorUrl) {
    this.operatorUrl = operatorUrl;
    return this;
  }

  @Override
  public String toString() {
    return "Request [operatorUrl=" + operatorUrl + "]";
  }
}
