package kinotek.kinotek_backend.repository.cinema;

import kinotek.kinotek_backend.model.cinema.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findMovieByMovieName(String movie);
}
