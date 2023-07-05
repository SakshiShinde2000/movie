package com.movieTicketBooking.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
	/*
	 * private String email; private String role;
	 */
    
	/*
	 * @OneToMany(mappedBy = "user") private List<TicketBooking> ticketBookings;
	 */


	public User() {
		super();
		
	}

	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public String getEmail() { return email; }
	 * 
	 * public void setEmail(String email) { this.email = email; }
	 * 
	 * public String getRole() { return role; }
	 * 
	 * public void setRole(String role) { this.role = role; }
	 */
	/*
	 * public List<TicketBooking> getTicketBookings() { return ticketBookings; }
	 * 
	 * public void setTicketBookings(List<TicketBooking> ticketBookings) {
	 * this.ticketBookings = ticketBookings; }
	 */

	
   
    
}