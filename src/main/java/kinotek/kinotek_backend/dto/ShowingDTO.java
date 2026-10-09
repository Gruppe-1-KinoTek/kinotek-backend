package kinotek.kinotek_backend.dto;

import java.time.LocalDateTime;

public class ShowingDTO {
    private int id;
    private LocalDateTime dateTime;
    private String auditorium;

    public ShowingDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(String auditorium) {
        this.auditorium = auditorium;
    }
}
