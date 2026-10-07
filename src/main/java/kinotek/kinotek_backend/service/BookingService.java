package kinotek.kinotek_backend.service;


import kinotek.kinotek_backend.model.cinema.Booking;
import java.util.List;


public interface BookingService {

    List<Booking> getBookings();
}
