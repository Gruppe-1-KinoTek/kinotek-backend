package kinotek.kinotek_backend.repository.cinema;

import kinotek.kinotek_backend.model.cinema.AgeRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgeRatingRepository extends JpaRepository<AgeRating, Integer> {
}
