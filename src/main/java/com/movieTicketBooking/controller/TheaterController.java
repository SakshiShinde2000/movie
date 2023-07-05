package com.movieTicketBooking.controller;

import com.movieTicketBooking.model.Theater;
import com.movieTicketBooking.service.TheaterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/theaters")
public class TheaterController {

    private final TheaterService theaterService;

    public TheaterController(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @GetMapping
    public ResponseEntity<List<Theater>> getAllTheaters() {
        List<Theater> theaters = theaterService.getAllTheaters();
        return ResponseEntity.ok(theaters);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Theater> getTheaterById(@PathVariable("id") Long id) {
        Theater theater = theaterService.getTheaterById(id);
        if (theater != null) {
            return ResponseEntity.ok(theater);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Theater> createTheater(@RequestBody Theater theater) {
        Theater createdTheater = theaterService.createTheater(theater);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTheater);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Theater> updateTheater(
            @PathVariable("id") Long id,
            @RequestBody Theater theater
    ) {
        Theater updatedTheater = theaterService.updateTheater(id, theater);
        if (updatedTheater != null) {
            return ResponseEntity.ok(updatedTheater);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTheater(@PathVariable("id") Long id) {
        theaterService.deleteTheater(id);
        return ResponseEntity.noContent().build();
    }
}
