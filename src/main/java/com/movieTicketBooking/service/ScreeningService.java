package com.movieTicketBooking.service;

import java.util.List;

import com.movieTicketBooking.model.Screening;

public interface ScreeningService {
    Screening createScreening(Screening screening);
    Screening updateScreening(Long id, Screening screening);
    void deleteScreening(Long id);
    Screening getScreeningById(Long id);
    List<Screening> getAllScreenings();
}

