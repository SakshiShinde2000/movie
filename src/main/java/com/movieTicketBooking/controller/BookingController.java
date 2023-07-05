/*
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.*;
 * 
 * import com.movieTicketBooking.model.TicketBooking; import
 * com.movieTicketBooking.service.BookingService;
 * 
 * @RestController
 * 
 * @RequestMapping("/ticketBookings") public class BookingController {
 * 
 * @Autowired private BookingService ticketBookingService;
 * 
 * @GetMapping public ResponseEntity<List<TicketBooking>> getAllTicketBookings()
 * { List<TicketBooking> ticketBookings =
 * ticketBookingService.getAllTicketBookings(); return
 * ResponseEntity.ok(ticketBookings); }
 * 
 * @GetMapping("/{id}") public ResponseEntity<TicketBooking>
 * getTicketBookingById(@PathVariable("id") Long id) { TicketBooking
 * ticketBooking = ticketBookingService.getTicketBookingById(id); if
 * (ticketBooking != null) { return ResponseEntity.ok(ticketBooking); } else {
 * return ResponseEntity.notFound().build(); } }
 * 
 * @PostMapping public ResponseEntity<TicketBooking>
 * createTicketBooking(@RequestBody TicketBooking ticketBooking) { TicketBooking
 * createdTicketBooking =
 * ticketBookingService.createTicketBooking(ticketBooking); return
 * ResponseEntity.status(HttpStatus.CREATED).body(createdTicketBooking); }
 * 
 * @PutMapping("/{id}") public ResponseEntity<TicketBooking>
 * updateTicketBooking(@PathVariable("id") Long id, @RequestBody TicketBooking
 * ticketBooking) { TicketBooking updatedTicketBooking =
 * ticketBookingService.updateTicketBooking(id, ticketBooking); if
 * (updatedTicketBooking != null) { return
 * ResponseEntity.ok(updatedTicketBooking); } else { return
 * ResponseEntity.notFound().build(); } }
 * 
 * @DeleteMapping("/{id}") public ResponseEntity<Void>
 * deleteTicketBooking(@PathVariable("id") Long id) {
 * ticketBookingService.deleteTicketBooking(id); return
 * ResponseEntity.noContent().build(); } }
 */