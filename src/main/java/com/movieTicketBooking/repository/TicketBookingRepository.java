package com.movieTicketBooking.repository;

import com.movieTicketBooking.model.TicketBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Long> {

    // Additional custom queries can be added here if needed

}
