package com.movieTicketBooking.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movieTicketBooking.model.Movie;
import com.movieTicketBooking.service.MovieService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

   
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<Movie>> searchMovies(@RequestParam String keyword) {
        List<Movie> movies = movieService.searchMovies(keyword);
        return ResponseEntity.ok(movies);
    }
    
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.createMovie(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMovie);
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int movieId) {
        Movie movie = movieService.getMovieById(movieId);
        if (movie != null) {
            return ResponseEntity.ok(movie);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/{movieId}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int movieId) {
        movieService.deleteMovie(movieId);
        return ResponseEntity.noContent().build();
    }
    
    
	/*
	 * @PutMapping("/{movieId}") public ResponseEntity<Movie>
	 * updateMovie(@PathVariable int movieId, @RequestBody Movie movie) { Movie
	 * updatedMovie = movieService.updateMovie(movieId, movie); if (updatedMovie !=
	 * null) { return ResponseEntity.ok(updatedMovie); } else { return
	 * ResponseEntity.notFound().build(); } }
	 */
}
