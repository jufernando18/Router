package co.com.ies.domain.enumeration;

public enum Url {

  GGB("http://localhost:9999/ggb/api"),
  BINGO("http://localhost:9999/bingo/api"),
  TRANSACTION("http://localhost:9999/transaction/api"),
  //CACHE("http://localhost:9999/cache/api"),
  CACHE("http://localhost:9898/simuladortransaction/transaction");

  private final String url;

  private Url() {
    this.url = null;
  }

  private Url(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}