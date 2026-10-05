package kinotek.kinotek_backend.model.user;

import jakarta.persistence.*;
import kinotek.kinotek_backend.model.cinema.Movie;

import java.util.List;

@Entity
public class Admin implements Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private int id;
    private String employeeName;
    private String password;

    public Admin(int id, String employeeName, String password) {
        this.id = id;
        this.employeeName = employeeName;
        this.password = password;
    }

    public Admin() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
