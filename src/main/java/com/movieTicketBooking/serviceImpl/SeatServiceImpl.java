package com.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieTicketBooking.model.Seat;
import com.movieTicketBooking.repository.SeatRepository;
import com.movieTicketBooking.service.SeatService;

@Service
public class SeatServiceImpl implements SeatService {

    private final SeatRepository seatRepository;

    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public Seat createSeat(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public Seat updateSeat(int id, Seat seat) {
        Seat existingSeat = seatRepository.findById(id).orElse(null);
        if (existingSeat != null) {
            existingSeat.setTheater(seat.getTheater());
            existingSeat.setSeatNumber(seat.getSeatNumber());
            existingSeat.setBooked(seat.isBooked());
            return seatRepository.save(existingSeat);
        }
        return null;
    }

    @Override
    public void deleteSeat(int id) {
        seatRepository.deleteById(id);
    }

    @Override
    public Seat getSeatById(int id) {
        return seatRepository.findById(id).orElse(null);
    }

    @Override
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }
}

