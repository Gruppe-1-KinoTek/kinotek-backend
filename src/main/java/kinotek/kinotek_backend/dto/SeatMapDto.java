package kinotek.kinotek_backend.dto;

import java.time.LocalDateTime;
import java.util.List;

public record SeatMapDto (
    int auditoriumId,
    String auditoriumName,
    String movieName,
    LocalDateTime dateTime,
    List<SeatStatusDto> seats
) {

}
