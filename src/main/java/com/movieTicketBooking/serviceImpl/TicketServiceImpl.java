package com.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieTicketBooking.model.Seat;
import com.movieTicketBooking.model.Ticket;
import com.movieTicketBooking.repository.TicketRepository;
import com.movieTicketBooking.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(int id, Ticket ticket) {
        Ticket existingTicket = ticketRepository.findById(id).orElse(null);
        if (existingTicket != null) {
            // Update the ticket properties
            existingTicket.setScreening(ticket.getScreening());
            existingTicket.setUser(ticket.getUser());
            return ticketRepository.save(existingTicket);
        }
        return null;
    }

    @Override
    public void deleteTicket(int id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public Ticket getTicketById(int id) {
        return ticketRepository.findById(id).orElse(null);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

	/*
	 * @Override public Ticket addSeatToTicket(int ticketId, Seat seat) { Ticket
	 * ticket = ticketRepository.findById(ticketId).orElse(null); if (ticket !=
	 * null) { ticket.addSeatToTicket(seat); return ticketRepository.save(ticket); }
	 * return null; }
	 * 
	 * @Override public Ticket removeSeatFromTicket(int ticketId, int seatId) {
	 * Ticket ticket = ticketRepository.findById(ticketId).orElse(null); if (ticket
	 * != null) { Seat seatToRemove = ticket.getSeats().stream() .filter(seat ->
	 * seat.getId() == seatId) .findFirst() .orElse(null); if (seatToRemove != null)
	 * { ticket.removeSeat(seatToRemove); ticketRepository.save(ticket); } return
	 * ticket; } return null; }
	 */
}
