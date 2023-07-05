package com.movieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieTicketBooking.model.Seat;


@Repository
public interface SeatRepository  extends JpaRepository<Seat, Integer> {

}
