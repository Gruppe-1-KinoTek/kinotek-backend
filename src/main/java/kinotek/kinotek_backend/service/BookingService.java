package kinotek.kinotek_backend.service;

import jakarta.annotation.Nullable;
import kinotek.kinotek_backend.model.cinema.Booking;


import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookingService {

    List<Booking> getBookings();
    Map<String, Object> createBookings(int showingId, Set<Integer> seatIds, @Nullable String email, Integer phoneNumber);
    List<Booking> getBookedSeatIds(int showingId);
}
