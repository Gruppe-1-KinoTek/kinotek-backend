package kinotek.kinotek_backend.service;

import kinotek.kinotek_backend.model.cinema.Booking;
import kinotek.kinotek_backend.model.cinema.Seat;
import kinotek.kinotek_backend.repository.cinema.BookingRepository;
import kinotek.kinotek_backend.repository.cinema.SeatRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    private final BookingRepository bookingRepository;

    public SeatServiceImpl(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Seat> getBookedSeats(int showingId) {
        List<Booking> bookings = bookingRepository.findByShowingId(showingId);

        List<Seat> seats = new ArrayList<>();

        for (Booking booking : bookings) {
            seats.add(booking.getSeat());
        }

        return seats;
    }

}
