package kinotek.kinotek_backend.model.cinema;

import java.io.Serializable;
import java.util.Objects;

public class BookingId implements Serializable {

        private int seat;
        private int showing;

        public BookingId() {}

        public BookingId(int seat, int showing) {
            this.seat = seat;
            this.showing = showing;
        }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookingId bookingId = (BookingId) o;
        return seat == bookingId.seat && showing == bookingId.showing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seat, showing);
    }

}
