
package com.movieTicketBooking.controller;

import com.movieTicketBooking.model.TicketBooking;
import com.movieTicketBooking.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket-bookings")
public class TicketBookingController {

    private final TicketBookingService ticketBookingService;

    @Autowired
    public TicketBookingController(TicketBookingService ticketBookingService) {
        this.ticketBookingService = ticketBookingService;
    }

    @PostMapping
    public ResponseEntity<TicketBooking> createTicketBooking(@RequestBody TicketBooking ticketBooking) {
        TicketBooking createdTicketBooking = ticketBookingService.createTicketBooking(ticketBooking);
        return new ResponseEntity<>(createdTicketBooking, HttpStatus.CREATED);
    }

    @GetMapping("/{bookingId}")
    public ResponseEntity<TicketBooking> getTicketBookingById(@PathVariable Long bookingId) {
        TicketBooking ticketBooking = ticketBookingService.getTicketBookingById(bookingId);
        if (ticketBooking != null) {
            return new ResponseEntity<>(ticketBooking, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<TicketBooking>> getAllTicketBookings() {
        List<TicketBooking> ticketBookings = ticketBookingService.getAllTicketBookings();
        return new ResponseEntity<>(ticketBookings, HttpStatus.OK);
    }

    @PutMapping("/{bookingId}")
    public ResponseEntity<TicketBooking> updateTicketBooking(
            @PathVariable Long bookingId, @RequestBody TicketBooking ticketBooking) {
        TicketBooking existingTicketBooking = ticketBookingService.getTicketBookingById(bookingId);
        if (existingTicketBooking != null) {
            ticketBooking.setBookingId(bookingId);
            TicketBooking updatedTicketBooking = ticketBookingService.updateTicketBooking(ticketBooking);
            return new ResponseEntity<>(updatedTicketBooking, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{bookingId}")
    public ResponseEntity<Void> deleteTicketBooking(@PathVariable Long bookingId) {
        TicketBooking existingTicketBooking = ticketBookingService.getTicketBookingById(bookingId);
        if (existingTicketBooking != null) {
            ticketBookingService.deleteTicketBooking(bookingId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Other methods...

}
