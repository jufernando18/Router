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
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + ((token == null) ? 0 : token.hashCode());
    result = prime * result + ((url == null) ? 0 : url.hashCode());
    return result;
  }

  @SuppressWarnings("all")
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
    LaunchGameModuleResponse other = (LaunchGameModuleResponse) obj;
    if (status == null) {
      if (other.status != null) {
        return false;
      }
    } else if (!status.equals(other.status)) {
      return false;
    }
    if (token == null) {
      if (other.token != null) {
        return false;
      }
    } else if (!token.equals(other.token)) {
      return false;
    }
    if (url == null) {
      if (other.url != null) {
        return false;
      }
    } else if (!url.equals(other.url)) {
      return false;
    }
    return true;
  }

  public boolean isEmpty() {
    LaunchGameModuleResponse o = new LaunchGameModuleResponse();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "LaunchGameModuleResponse [url=" + url + ", token=" + token + ", status=" + status + "]";
  }

}
