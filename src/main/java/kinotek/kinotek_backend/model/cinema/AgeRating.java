package kinotek.kinotek_backend.model.cinema;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class AgeRating {

    @Id
    @Column(name = "age_rating_id")
    private int id;
    private String ageRating;

    //One to many
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ageRating")
    @JsonBackReference
    private Set<Movie> movies = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
