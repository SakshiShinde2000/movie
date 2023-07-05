package com.movieTicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieTicketBooking.model.Screening;
import com.movieTicketBooking.service.ScreeningService;

@RestController
@RequestMapping("/screenings")
public class ScreeningController {
    private final ScreeningService screeningService;

    @Autowired
    public ScreeningController(ScreeningService screeningService) {
        this.screeningService = screeningService;
    }

    @PostMapping
    public ResponseEntity<Screening> createScreening(@RequestBody Screening screening) {
        Screening createdScreening = screeningService.createScreening(screening);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdScreening);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Screening> updateScreening(@PathVariable("id") Long id, @RequestBody Screening screening) {
        Screening updatedScreening = screeningService.updateScreening(id, screening);
        return ResponseEntity.ok(updatedScreening);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteScreening(@PathVariable("id") Long id) {
        screeningService.deleteScreening(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Screening> getScreeningById(@PathVariable("id") Long id) {
        Screening screening = screeningService.getScreeningById(id);
        if (screening != null) {
            return ResponseEntity.ok(screening);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Screening>> getAllScreenings() {
        List<Screening> screenings = screeningService.getAllScreenings();
        return ResponseEntity.ok(screenings);
    }
}
