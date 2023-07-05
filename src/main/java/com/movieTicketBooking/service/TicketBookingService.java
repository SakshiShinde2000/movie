package com.movieTicketBooking.service;

import com.movieTicketBooking.model.TicketBooking;

import java.util.List;

public interface TicketBookingService {
    TicketBooking createTicketBooking(TicketBooking ticketBooking);
    TicketBooking getTicketBookingById(Long bookingId);
    List<TicketBooking> getAllTicketBookings();
    TicketBooking updateTicketBooking(TicketBooking ticketBooking);
    void deleteTicketBooking(Long bookingId);
    // Other methods...
}
