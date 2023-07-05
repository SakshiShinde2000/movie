package com.movieTicketBooking.service;

import java.util.List;

import com.movieTicketBooking.model.Movie;

public interface MovieService {
    Movie createMovie(Movie movie);
    Movie updateMovie(int id, Movie movie);
    void deleteMovie(int id);
    Movie getMovieById(int id);
    List<Movie> getAllMovies();
    List<Movie> searchMovies(String keyword);
}

