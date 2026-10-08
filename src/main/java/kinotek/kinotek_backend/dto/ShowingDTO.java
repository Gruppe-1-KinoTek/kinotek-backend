package kinotek.kinotek_backend.dto;

import java.time.LocalDateTime;

public class ShowingDTO {
    private LocalDateTime dateTime;
    private String auditorium;

    public ShowingDTO() {
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
