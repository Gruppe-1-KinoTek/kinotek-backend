package kinotek.kinotek_backend.repository.cinema;

import kinotek.kinotek_backend.model.cinema.Showing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowingRepository extends JpaRepository<Showing, Integer> {
}
