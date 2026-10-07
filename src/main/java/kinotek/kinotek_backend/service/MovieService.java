package kinotek.kinotek_backend.service;

import kinotek.kinotek_backend.model.cinema.AgeRating;
import kinotek.kinotek_backend.model.cinema.Genre;
import kinotek.kinotek_backend.model.cinema.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getMovies();
    Movie getMovieById(int id);
    Movie saveMovie(Movie movie);
    Movie updateMovie(int id,Movie movie);
    void deleteMovieById(int id);
    List<Genre> getGenres();
    List<AgeRating> ageRatings();

}
