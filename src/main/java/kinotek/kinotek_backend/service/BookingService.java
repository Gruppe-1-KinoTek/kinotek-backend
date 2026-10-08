package kinotek.kinotek_backend.service;


import kinotek.kinotek_backend.model.cinema.Booking;
import java.util.List;
import java.util.Set;


public interface BookingService {

    List<Booking> getBookings();

    public Set<Integer> bookedSeatIdsByShowingId(int showingId);

}
