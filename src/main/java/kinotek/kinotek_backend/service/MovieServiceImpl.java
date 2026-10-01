package kinotek.kinotek_backend.service;

import kinotek.kinotek_backend.repository.cinema.MovieRepository;

public class MovieServiceImpl implements MovieService{
    private final MovieRepository movieRepository;
    public MovieServiceImpl(MovieRepository movieRepository) {this.movieRepository = movieRepository;}
}
