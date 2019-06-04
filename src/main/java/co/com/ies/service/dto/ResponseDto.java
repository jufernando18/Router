package co.com.ies.service.dto;

import javax.validation.constraints.NotBlank;

public class ResponseDto {

  @NotBlank
  private String url;

  public ResponseDto() {
    super();
  }

  public String getUrl() {
    return url;
  }

  public ResponseDto setUrl(String url) {
    this.url = url;
    return this;
  }

  @Override
  public String toString() {
    return "Response [url=" + url + "]";
  }
}
