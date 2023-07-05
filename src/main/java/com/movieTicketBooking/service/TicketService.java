package com.movieTicketBooking.service;

import java.util.List;

import com.movieTicketBooking.model.Ticket;

public interface TicketService {
    Ticket createTicket(Ticket ticket);
    Ticket updateTicket(int id, Ticket ticket);
    void deleteTicket(int id);
    Ticket getTicketById(int id);
    List<Ticket> getAllTickets();
    
	/*
	 * Ticket addSeatToTicket(int ticketId, Seat seat); Ticket
	 * removeSeatFromTicket(int ticketId, int seatId);
	 */
}
