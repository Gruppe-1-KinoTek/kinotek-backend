package kinotek.kinotek_backend.controller;

import jakarta.annotation.Nullable;
import kinotek.kinotek_backend.model.cinema.Booking;
import kinotek.kinotek_backend.model.cinema.Seat;
import kinotek.kinotek_backend.model.cinema.Showing;
import kinotek.kinotek_backend.service.BookingService;
import kinotek.kinotek_backend.service.MovieService;
import kinotek.kinotek_backend.service.SeatService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("")
public class BookingRestController {

    private final SeatService seatService;

    public BookingRestController(SeatService seatService){
        this.seatService = seatService;
    }

    @GetMapping("/showing/{showingId}/booked-seats")
    public List<Seat> getBookedSeats(@PathVariable int showingId) {
        return seatService.getBookedSeats(showingId);
    }




}
