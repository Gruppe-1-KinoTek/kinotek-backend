package kinotek.kinotek_backend.service;

import kinotek.kinotek_backend.model.cinema.AgeRating;
import kinotek.kinotek_backend.model.cinema.Genre;
import kinotek.kinotek_backend.model.cinema.Movie;
import kinotek.kinotek_backend.repository.cinema.AgeRatingRepository;
import kinotek.kinotek_backend.repository.cinema.GenreRepository;
import kinotek.kinotek_backend.repository.cinema.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final GenreRepository genreRepository;
    private final AgeRatingRepository ageRatingRepository;

    public MovieServiceImpl(MovieRepository movieRepository, GenreRepository genreRepository, AgeRatingRepository ageRatingRepository) {
        this.movieRepository = movieRepository;
        this.genreRepository = genreRepository;
        this.ageRatingRepository = ageRatingRepository;
    }

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public Movie saveMovie(Movie movie) {
        movie.setId(0);
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(int id, Movie movie) {
        movie.setId(id);
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMovieById(int id) {
        movieRepository.deleteById(id);
    }

    @Override
    public List<Genre> getGenres() {
        return genreRepository.findAll();
    }

    @Override
    public List<AgeRating> ageRatings() {
        return ageRatingRepository.findAll();
    }



}
