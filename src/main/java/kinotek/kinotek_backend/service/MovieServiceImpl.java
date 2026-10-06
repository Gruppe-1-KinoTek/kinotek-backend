package kinotek.kinotek_backend.service;

import kinotek.kinotek_backend.model.cinema.Movie;
import kinotek.kinotek_backend.repository.cinema.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
}
