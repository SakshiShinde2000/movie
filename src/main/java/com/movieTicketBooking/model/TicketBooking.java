package com.movieTicketBooking.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class TicketBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "screening_id")
    private Screening screening;

    @OneToMany(mappedBy = "ticketBooking")
    private List<Ticket> tickets;

    public TicketBooking() {
        // Default constructor
    }

    public TicketBooking(User user, Screening screening, List<Ticket> tickets) {
        this.user = user;
        this.screening = screening;
        this.tickets = tickets;
    }

    // Getters and Setters

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
