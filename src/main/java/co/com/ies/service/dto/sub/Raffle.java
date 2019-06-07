package co.com.ies.service.dto.sub;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;

public class Raffle {

  @NotNull
  @PositiveOrZero
  private Long id;
  @NotBlank
  private String name;
  @NotBlank
  private String state;
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

  public Raffle setState(String state) {
    this.state = state;
    return this;
  }

  public String getName() {
    return name;
  }

  public Raffle setName(String name) {
    this.name = name;
    return this;
  }

  public Long getId() {
    return id;
  }

  public Raffle setId(Long id) {
    this.id = id;
    return this;
  }

  public Date getLaunchingDate() {
    return launchingDate;
  }

  public Raffle setLaunchingDate(Date launchingDate) {
    this.launchingDate = launchingDate;
    return this;
  }

  public BigDecimal getTablePrize() {
    return tablePrize;
  }

  public Raffle setTablePrize(BigDecimal tablePrize) {
    this.tablePrize = tablePrize;
    return this;
  }

  public String getRaffleType() {
    return raffleType;
  }

  public Raffle setRaffleType(String raffleType) {
    this.raffleType = raffleType;
    return this;
  }

  public List<FigureAndAward> getAwards() {
    return awards;
  }

  public Raffle setAwards(List<FigureAndAward> awards) {
    this.awards = awards;
    return this;
  }

  @Override
  public String toString() {
    return "Raffle [state=" + state + ", name=" + name + ", id=" + id + ", launchingDate="
        + launchingDate + ", tablePrize=" + tablePrize + ", raffleType=" + raffleType + ", awards="
        + awards + "]";
  }
  
}
