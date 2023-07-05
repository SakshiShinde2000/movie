package com.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicketBooking.model.TicketBooking;
import com.movieTicketBooking.repository.TicketBookingRepository;
import com.movieTicketBooking.service.TicketBookingService;

@Service
public class TicketBookingServiceImpl implements TicketBookingService {

    private final TicketBookingRepository ticketBookingRepository;

    @Autowired
    public TicketBookingServiceImpl(TicketBookingRepository ticketBookingRepository) {
        this.ticketBookingRepository = ticketBookingRepository;
    }

    @Override
    public TicketBooking createTicketBooking(TicketBooking ticketBooking) {
        return ticketBookingRepository.save(ticketBooking);
    }

    @Override
    public TicketBooking getTicketBookingById(Long bookingId) {
        return ticketBookingRepository.findById(bookingId).orElse(null);
    }

    @Override
    public List<TicketBooking> getAllTicketBookings() {
        return ticketBookingRepository.findAll();
    }

    @Override
    public TicketBooking updateTicketBooking(TicketBooking ticketBooking) {
        return ticketBookingRepository.save(ticketBooking);
    }

    @Override
    public void deleteTicketBooking(Long bookingId) {
        ticketBookingRepository.deleteById(bookingId);
    }

    // Other methods...

}
