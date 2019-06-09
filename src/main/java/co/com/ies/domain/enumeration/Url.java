package co.com.ies.domain.enumeration;

public enum Url {

  GGB("http://localhost:9888/ggb/api"),
  BINGO("http://localhost:9888/bingo/api"),
  TRANSACTION("http://localhost:9888/transaction/api"),
  //CACHE("http://localhost:9999/cache/api"),
  CACHE("http://localhost:9888/simuladortransaction/transaction"),
  OPERATOR_MODULE_ENDPOINT("http://localhost:9888/simulatoroperatormodule"),
  LAUNCH_GAME("/launchgame"),
  GET_ROOMS("/getrooms"),
  GET_RAFFLES("/getraffles"),
  GET_ALL_RAFFLES("/getallraffles");

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