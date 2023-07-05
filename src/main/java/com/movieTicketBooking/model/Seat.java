package com.movieTicketBooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;
    
    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;
    
   
    
    private String seatNumber;
    private boolean isBooked;
    
    
	public Seat() {
		super();
	
	}


	public Seat(Long seatId, Theater theater, String seatNumber, boolean isBooked) {
		super();
		this.seatId = seatId;
		this.theater = theater;
		this.seatNumber = seatNumber;
		this.isBooked = isBooked;
	}


	public Long getSeatId() {
		return seatId;
	}


	public void setSeatId(Long seatId) {
		this.seatId = seatId;
	}


	public Theater getTheater() {
		return theater;
	}


	public void setTheater(Theater theater) {
		this.theater = theater;
	}


	public String getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}


	public boolean isBooked() {
		return isBooked;
	}


	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
    
    
    
  



}
