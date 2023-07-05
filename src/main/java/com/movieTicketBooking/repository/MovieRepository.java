package com.movieTicketBooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movieTicketBooking.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

	 @Query("SELECT m FROM Movie m WHERE m.title LIKE %:keyword%")
	    List<Movie> searchMovies(@Param("keyword") String keyword);
}
