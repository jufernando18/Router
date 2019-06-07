package co.com.ies.service.dto.sub;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class RoomAndRaffleResume {

  @NotNull
  @PositiveOrZero
  private Long id;
  @NotBlank
  private String name;
  @NotBlank
  private String description;
  @NotNull
  private List<RaffleResume> rafflesResume;

  public RoomAndRaffleResume() {
    super();
  }

  public Long getId() {
    return id;
  }

  public RoomAndRaffleResume setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public RoomAndRaffleResume setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RoomAndRaffleResume setDescription(String description) {
    this.description = description;
    return this;
  }

  public List<RaffleResume> getRafflesResume() {
    return rafflesResume;
  }

  public RoomAndRaffleResume setRafflesResume(List<RaffleResume> rafflesResume) {
    this.rafflesResume = rafflesResume;
    return this;
  }

  @Override
  public String toString() {
    return "RoomAndRaffleResume [id=" + id + ", name=" + name + ", description=" + description
        + ", rafflesResume=" + rafflesResume + "]";
  }

}
