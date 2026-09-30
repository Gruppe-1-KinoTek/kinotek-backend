package kinotek.kinotek_backend.model.cinema;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import kinotek.kinotek_backend.model.user.Employee;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Auditorium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String auditoriumName;

    @OneToMany(mappedBy = "auditorium",cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<SeatRow> rows = new ArrayList<>();

    public void addRow(SeatRow row) {
        rows.add(row);
        row.setAuditorium(this);
    }

    public Auditorium(int id, String auditoriumName, List<SeatRow> rows) {
        this.id = id;
        this.auditoriumName = auditoriumName;
        this.rows = rows;
    }

    public Auditorium() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuditoriumName() {
        return auditoriumName;
    }

    public void setAuditoriumName(String auditoriumName) {
        this.auditoriumName = auditoriumName;
    }

    public List<SeatRow> getRows() {
        return rows;
    }

    public void setRows(List<SeatRow> rows) {
        this.rows = rows;
    }


}
