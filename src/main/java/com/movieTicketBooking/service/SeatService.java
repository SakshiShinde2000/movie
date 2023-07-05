package com.movieTicketBooking.service;

import java.util.List;

import com.movieTicketBooking.model.Seat;

public interface SeatService {
    Seat createSeat(Seat seat);
    Seat updateSeat(int id, Seat seat);
    void deleteSeat(int id);
    Seat getSeatById(int id);
    List<Seat> getAllSeats();
}

