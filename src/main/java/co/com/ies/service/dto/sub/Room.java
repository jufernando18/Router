package co.com.ies.service.dto.sub;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class Room {

  @NotBlank
  private String name;
  @NotBlank
  private String description;
  @NotNull
  @PositiveOrZero
  private Integer forPlaying;

  public Room() {
    super();
  }

  public String getName() {
    return name;
  }

  public Room setName(String name) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Room setDescription(String description) {
    this.description = description;
    return this;
  }

  public Integer getForPlaying() {
    return forPlaying;
  }

  public Room setForPlaying(Integer forPlaying) {
    this.forPlaying = forPlaying;
    return this;
  }

  @Override
  public String toString() {
    return "Room [name=" + name + ", description=" + description + ", forPlaying=" + forPlaying
        + "]";
  }

}
