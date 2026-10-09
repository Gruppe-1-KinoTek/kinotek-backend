package kinotek.kinotek_backend.repository.cinema;

import kinotek.kinotek_backend.model.cinema.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
