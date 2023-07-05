package com.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieTicketBooking.model.Movie;
import com.movieTicketBooking.repository.MovieRepository;
import com.movieTicketBooking.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> searchMovies(String keyword) {
        return movieRepository.searchMovies(keyword);
    }
    @Override
    public Movie updateMovie(int id, Movie movie) {
        Movie existingMovie = movieRepository.findById(id).orElse(null);
        if (existingMovie != null) {
            existingMovie.setMovieName(movie.getMovieName());
            existingMovie.setMovieGenre(movie.getMovieGenre());
            existingMovie.setMovieHours(movie.getMovieHours());
            existingMovie.setDirector(movie.getDirector());
            existingMovie.setRating(movie.getRating());
            return movieRepository.save(existingMovie);
        }
        return null;
    }

    @Override
    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

    @Override
    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}



