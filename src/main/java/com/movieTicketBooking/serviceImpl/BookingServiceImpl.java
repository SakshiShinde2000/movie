/*
 * package com.movieTicketBooking.serviceImpl;
 * 
 * import java.util.List;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import com.movieTicketBooking.model.Ticket; import
 * com.movieTicketBooking.model.TicketBooking; import
 * com.movieTicketBooking.repository.BookingRepository; import
 * com.movieTicketBooking.service.BookingService;
 * 
 * @Service public class BookingServiceImpl implements BookingService {
 * 
 * private final BookingRepository BookingRepository;
 * 
 * public BookingServiceImpl(BookingRepository ticketBookingRepository) {
 * this.BookingRepository = ticketBookingRepository; }
 * 
 * @Override public TicketBooking createTicketBooking(TicketBooking
 * ticketBooking) { return BookingRepository.save(ticketBooking); }
 * 
 * @Override public TicketBooking updateTicketBooking(Long id, TicketBooking
 * ticketBooking) { TicketBooking existingTicketBooking =
 * ticketBookingRepository.findById(id).orElse(null); if (existingTicketBooking
 * != null) { existingTicketBooking.setUser(ticketBooking.getUser());
 * existingTicketBooking.setTicket(ticketBooking.getTicket()); return
 * ticketBookingRepository.save(existingTicketBooking); } return null; }
 * 
 * @Override public void deleteTicketBooking(Long id) {
 * ticketBookingRepository.deleteById(id); }
 * 
 * @Override public TicketBooking getTicketBookingById(Long id) { return
 * ticketBookingRepository.findById(id).orElse(null); }
 * 
 * @Override public List<TicketBooking> getAllTicketBookings() { return
 * ticketBookingRepository.findAll(); }
 * 
 * @Override public TicketBooking addTicketToBooking(Long bookingId, Ticket
 * ticket) { TicketBooking ticketBooking =
 * BookingRepository.findById(bookingId).orElse(null); if (ticketBooking !=
 * null) { ticketBooking.setTicket(ticket); return
 * BookingRepository.save(ticketBooking); } return null; }
 * 
 * @Override public TicketBooking removeTicketFromBooking(int bookingId, int
 * ticketId) { TicketBooking ticketBooking
 * =BookingRepository.findById(bookingId).orElse(null); if (ticketBooking !=
 * null && ticketBooking.getTicket() != null &&
 * ticketBooking.getTicket().getTicketId().equals(ticketId)) {
 * ticketBooking.setTicket(null); return BookingRepository.save(ticketBooking);
 * } return null; } }
 */