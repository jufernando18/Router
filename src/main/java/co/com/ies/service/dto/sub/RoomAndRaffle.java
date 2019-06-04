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
}
