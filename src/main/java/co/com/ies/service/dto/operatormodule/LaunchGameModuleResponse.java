package co.com.ies.service.dto.operatormodule;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import co.com.ies.service.dto.sub.StatusDto;

public class LaunchGameModuleResponse {

  @NotBlank
  private String url;
  @NotBlank
  private String token;
  @NotNull
  private StatusDto status;

  public LaunchGameModuleResponse() {
    super();
  }

  public String getUrl() {
    return url;
  }

  public LaunchGameModuleResponse setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getToken() {
    return token;
  }

  public LaunchGameModuleResponse setToken(String token) {
    this.token = token;
    return this;
  }

  public StatusDto getStatus() {
    return status;
  }

  public LaunchGameModuleResponse setStatus(StatusDto status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    return "LaunchGameModuleResponse [url=" + url + ", token=" + token + ", status=" + status + "]";
  }

}
