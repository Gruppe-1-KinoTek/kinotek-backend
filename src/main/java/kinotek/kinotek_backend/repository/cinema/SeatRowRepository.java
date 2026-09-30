package kinotek.kinotek_backend.repository.cinema;

import kinotek.kinotek_backend.model.cinema.SeatRow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRowRepository extends JpaRepository<SeatRow, String> {
}
