package co.com.ies.service.dto.sub;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class RoomAndRaffle {

  @NotBlank
  private String name;
  @NotBlank
  private String description;
  @NotNull
  @PositiveOrZero
  private Integer forPlaying;
  @NotNull
  private List<Raffle> raffles;
  
  public RoomAndRaffle() {
    super();
  }

  public String getName() {
    return name;
  }

  public RoomAndRaffle setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RoomAndRaffle setDescription(String description) {
    this.description = description;
    return this;
  }

  public Integer getForPlaying() {
    return forPlaying;
  }

  public RoomAndRaffle setForPlaying(Integer forPlaying) {
    this.forPlaying = forPlaying;
    return this;
  }

  public List<Raffle> getRaffles() {
    return raffles;
  }

  public RoomAndRaffle setRaffles(List<Raffle> raffles) {
    this.raffles = raffles;
    return this;
  }

  @Override
  public String toString() {
    return "RoomAndRaffle [name=" + name + ", description=" + description + ", forPlaying="
        + forPlaying + ", raffles=" + raffles + "]";
  }
  
}
