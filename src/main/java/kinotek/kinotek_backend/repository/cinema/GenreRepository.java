package kinotek.kinotek_backend.repository.cinema;

import kinotek.kinotek_backend.model.cinema.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
