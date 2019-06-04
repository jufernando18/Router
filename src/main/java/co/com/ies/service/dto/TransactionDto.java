package co.com.ies.service.dto;

import co.com.ies.domain.enumeration.TransType;

import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TransactionDto {
  
  @NotBlank
  private TransType operationType;
  @NotBlank
  private String token;
  @NotBlank
  private String url;
  @NotNull
  @NotEmpty
  private Map<String, Object> body;

  public TransactionDto() {
    super();
  }

  /**
   * Modelo de información que se recibe de Transaction.
   * 
   * @param operationType tipo de operación que quiere que se realice
   * @param token         token que entrega Transaction
   * @param url           campo para pasar url de operador
   * @param body          para manejar los demás datos
   */
  public TransactionDto(TransType operationType, String token, String url,
      Map<String, Object> body) {
    super();
    this.operationType = operationType;
    this.token = token;
    this.url = url;
    this.body = body;
  }

  public TransType getOperationType() {
    return operationType;
  }

  public TransactionDto setOperationType(TransType operationType) {
    this.operationType = operationType;
    return this;
  }

  public String getToken() {
    return token;
  }

  public TransactionDto setToken(String token) {
    this.token = token;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public TransactionDto setUrl(String url) {
    this.url = url;
    return this;
  }

  public Map<String, Object> getBody() {
    return body;
  }

  public TransactionDto setBody(Map<String, Object> body) {
    this.body = body;
    return this;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((body == null) ? 0 : body.hashCode());
    result = prime * result + ((operationType == null) ? 0 : operationType.hashCode());
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
    TransactionDto other = (TransactionDto) obj;
    if (body == null) {
      if (other.body != null) {
        return false;
      }
    } else if (!body.equals(other.body)) {
      return false;
    }
    if (operationType != other.operationType) {
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
    TransactionDto o = new TransactionDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "TransactionDto [operationType=" + operationType + ", token=" + token + ", url=" + url
        + ", body=" + body + "]";
  }

}
