package kinotek.kinotek_backend.model.cinema;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Showing {
    @Id
    private int showingId;
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "auditorium_id")
    private Auditorium  auditorium;


    public int getShowingId() {
        return showingId;
    }

    public void setShowingId(int showingId) {
        this.showingId = showingId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }
}
