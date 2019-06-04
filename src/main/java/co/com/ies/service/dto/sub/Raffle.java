package co.com.ies.service.dto.sub;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

public class Raffle {

  @NotBlank
  private String state;
  @NotNull
  private Integer id;
  @PastOrPresent
  private Date launchingDate;
  @NotNull
  private BigDecimal tablePrize;
  @NotBlank
  private String raffleType;
  @NotNull
  private List<FigureAndAward> awards;
  
  public Raffle() {
    super();
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getLaunchingDate() {
    return launchingDate;
  }

  public void setLaunchingDate(Date launchingDate) {
    this.launchingDate = launchingDate;
  }

  public BigDecimal getTablePrize() {
    return tablePrize;
  }

  public void setTablePrize(BigDecimal tablePrize) {
    this.tablePrize = tablePrize;
  }

  public String getRaffleType() {
    return raffleType;
  }

  public void setRaffleType(String raffleType) {
    this.raffleType = raffleType;
  }

  public List<FigureAndAward> getAwards() {
    return awards;
  }

  public void setAwards(List<FigureAndAward> awards) {
    this.awards = awards;
  }

  @Override
  public String toString() {
    return "Raffle [state=" + state + ", id=" + id + ", launchingDate=" + launchingDate
        + ", tablePrize=" + tablePrize + ", raffleType=" + raffleType + ", awards=" + awards + "]";
  }
  
  
}
