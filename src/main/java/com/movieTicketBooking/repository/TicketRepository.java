package com.movieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieTicketBooking.model.Ticket;

@Repository
public interface TicketRepository  extends JpaRepository<Ticket, Integer>{

}
