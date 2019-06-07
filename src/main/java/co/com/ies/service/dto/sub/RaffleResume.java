package co.com.ies.service.dto.sub;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;

public class RaffleResume {

  @NotNull
  @PositiveOrZero
  private Long id;
  @NotBlank
  private String name;
  @NotBlank
  private String state;
  @PastOrPresent
  private Date launchingDate;
  
  public RaffleResume() {
    super();
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getLaunchingDate() {
    return launchingDate;
  }

  public void setLaunchingDate(Date launchingDate) {
    this.launchingDate = launchingDate;
  }

  @Override
  public String toString() {
    return "RaffleResume [state=" + state + ", name=" + name + ", id=" + id + ", launchingDate="
        + launchingDate + "]";
  }
  
  
}
