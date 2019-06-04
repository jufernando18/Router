package co.com.ies.service.dto;

import co.com.ies.domain.enumeration.TransType;

import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Es el modelo para los datos más generales asociados al operador.
 * 
 * @author Fernando Echavarria
 */
public class OperatorModuleDto {

  @NotBlank
  private TransType operationType;
  @NotBlank
  private String user;
  @NotBlank
  private String pass;
  @NotBlank
  private String token;
  @NotBlank
  private String name;
  @NotBlank
  private String url;
  @NotNull
  @NotEmpty
  private Map<String, Object> body;

  public OperatorModuleDto() {
    super();
  }

  public TransType getOperationType() {
    return operationType;
  }

  public OperatorModuleDto setOperationType(TransType operationType) {
    this.operationType = operationType;
    return this;
  }

  public String getUser() {
    return user;
  }

  public OperatorModuleDto setUser(String user) {
    this.user = user;
    return this;
  }

  public String getPass() {
    return pass;
  }

  public OperatorModuleDto setPass(String pass) {
    this.pass = pass;
    return this;
  }

  public String getToken() {
    return token;
  }

  public OperatorModuleDto setToken(String token) {
    this.token = token;
    return this;
  }

  public String getName() {
    return name;
  }

  public OperatorModuleDto setName(String name) {
    this.name = name;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public OperatorModuleDto setUrl(String url) {
    this.url = url;
    return this;
  }

  public Map<String, Object> getBody() {
    return body;
  }

  public OperatorModuleDto setBody(Map<String, Object> body) {
    this.body = body;
    return this;
  }

  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((body == null) ? 0 : body.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((operationType == null) ? 0 : operationType.hashCode());
    result = prime * result + ((pass == null) ? 0 : pass.hashCode());
    result = prime * result + ((token == null) ? 0 : token.hashCode());
    result = prime * result + ((url == null) ? 0 : url.hashCode());
    result = prime * result + ((user == null) ? 0 : user.hashCode());
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
    OperatorModuleDto other = (OperatorModuleDto) obj;
    if (body == null) {
      if (other.body != null) {
        return false;
      }
    } else if (!body.equals(other.body)) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    if (operationType != other.operationType) {
      return false;
    }
    if (pass == null) {
      if (other.pass != null) {
        return false;
      }
    } else if (!pass.equals(other.pass)) {
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
    if (user == null) {
      if (other.user != null) {
        return false;
      }
    } else if (!user.equals(other.user)) {
      return false;
    }
    return true;
  }
  
  public boolean isEmpty() {
    OperatorModuleDto o = new OperatorModuleDto();
    return o.equals(this);
  }

  @Override
  public String toString() {
    return "OperatorDto [operationType=" + operationType + ", user=" + user + ", pass=" + pass
        + ", token=" + token + ", name=" + name + ", url=" + url + ", body=" + body + "]";
  }

  
}
