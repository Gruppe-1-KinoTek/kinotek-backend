package kinotek.kinotek_backend.service;

import kinotek.kinotek_backend.model.cinema.Movie;

import java.util.List;

public interface MovieService {

    Movie saveMovie(Movie movie);
    List<Movie> getMovies();

}
