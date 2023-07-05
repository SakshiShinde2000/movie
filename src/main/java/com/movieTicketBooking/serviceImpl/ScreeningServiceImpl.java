package com.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieTicketBooking.model.Screening;
import com.movieTicketBooking.repository.ScreeningRepository;
import com.movieTicketBooking.service.ScreeningService;

@Service
public class ScreeningServiceImpl implements ScreeningService {

    private final ScreeningRepository screeningRepository;

    public ScreeningServiceImpl(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    @Override
    public Screening createScreening(Screening screening) {
        return screeningRepository.save(screening);
    }

    @Override
    public Screening updateScreening(Long id, Screening screening) {
        Screening existingScreening = screeningRepository.findById(id).orElse(null);
        if (existingScreening != null) {
            existingScreening.setMovie(screening.getMovie());
            existingScreening.setTheater(screening.getTheater());
            existingScreening.setDate(screening.getDate());
            existingScreening.setTime(screening.getTime());
            return screeningRepository.save(existingScreening);
        }
        return null;
    }

    @Override
    public void deleteScreening(Long id) {
        screeningRepository.deleteById(id);
    }

    @Override
    public Screening getScreeningById(Long id) {
        return screeningRepository.findById(id).orElse(null);
    }

    @Override
    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }
}
