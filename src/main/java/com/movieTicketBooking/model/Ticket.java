package com.movieTicketBooking.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    
    @ManyToOne
    @JoinColumn(name = "screening_id")
    private Screening screening;
    
    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    private TicketBooking ticketBooking;

	public Ticket() {
		super();
		
	}

	public Ticket(Long ticketId, Screening screening, Seat seat, User user, TicketBooking ticketBooking) {
		super();
		this.ticketId = ticketId;
		this.screening = screening;
		this.seat = seat;
		this.user = user;
		this.ticketBooking = ticketBooking;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public Screening getScreening() {
		return screening;
	}

	public void setScreening(Screening screening) {
		this.screening = screening;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TicketBooking getTicketBooking() {
		return ticketBooking;
	}

	public void setTicketBooking(TicketBooking ticketBooking) {
		this.ticketBooking = ticketBooking;
	}

	
    
}


