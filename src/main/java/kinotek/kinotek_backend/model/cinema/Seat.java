package kinotek.kinotek_backend.model.cinema;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "row_id")
    @JsonBackReference("row-seats")
    private SeatRow row;

    private int seatNumber;
    private boolean accessible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SeatRow getRow() {
        return row;
    }

    public void setRow(SeatRow row) {
        this.row = row;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }
}
