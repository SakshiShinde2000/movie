package com.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieTicketBooking.model.Theater;
import com.movieTicketBooking.repository.TheaterRepository;
import com.movieTicketBooking.service.TheaterService;

@Service
public class TheaterServiceImpl implements TheaterService {

    private final TheaterRepository theaterRepository;

    public TheaterServiceImpl(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    @Override
    public Theater createTheater(Theater theater) {
        return theaterRepository.save(theater);
    }

    @Override
    public Theater updateTheater(Long id, Theater theater) {
        Theater existingTheater = theaterRepository.findById(id).orElse(null);
        if (existingTheater != null) {
            existingTheater.setName(theater.getName());
            existingTheater.setLocation(theater.getLocation());
            return theaterRepository.save(existingTheater);
        }
        return null;
    }

    @Override
    public void deleteTheater(Long id) {
        theaterRepository.deleteById(id);
    }

    @Override
    public Theater getTheaterById(Long id) {
        return theaterRepository.findById(id).orElse(null);
    }

    @Override
    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }
}


