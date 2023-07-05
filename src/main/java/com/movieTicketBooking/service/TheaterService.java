package com.movieTicketBooking.service;

import java.util.List;

import com.movieTicketBooking.model.Theater;

public interface TheaterService {
    Theater createTheater(Theater theater);
    Theater updateTheater(Long id, Theater theater);
    void deleteTheater(Long id);
    Theater getTheaterById(Long id);
    List<Theater> getAllTheaters();
}

