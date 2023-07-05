package com.movieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicketBooking.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {
    // Add custom query methods if needed
}
