package com.movieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieTicketBooking.model.Screening;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {
}

