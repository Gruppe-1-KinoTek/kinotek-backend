package kinotek.kinotek_backend.controller;

import jakarta.annotation.Nullable;
import kinotek.kinotek_backend.model.cinema.Booking;
import kinotek.kinotek_backend.model.cinema.Showing;
import kinotek.kinotek_backend.service.BookingService;
import kinotek.kinotek_backend.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("")
public class BookingRestController {

    private final BookingService bookingService;
    private final MovieService movieService;

    public BookingRestController(BookingService bookingService, MovieService movieService){
        this.bookingService = bookingService;
        this.movieService = movieService;
    }

    @GetMapping("/movie/{id}")
    public List<Showing> getFutureShowingsByMovieId(@PathVariable int id) {
        return movieService.getFutureShowings(id);
    }

    @GetMapping("/showing/{showingId}")
    public List<Booking> getBookedSeatIds(@PathVariable int showingId) {
        return bookingService.getBookedSeatIds(showingId);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Object> createBookings (@RequestBody int showingId, Set<Integer> seatIds,
                                               @Nullable String email, Integer phoneNumber){
        return bookingService.createBookings(showingId, seatIds, email, phoneNumber);
    }





}
