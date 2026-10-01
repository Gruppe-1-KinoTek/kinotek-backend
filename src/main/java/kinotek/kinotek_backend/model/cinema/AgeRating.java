package kinotek.kinotek_backend.model.cinema;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class AgeRating {

    @Id
    private int ageRatingId;
    private String ageRating;

    //One to many
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ageRating")
    @JsonBackReference
    private Set<Movie> movies = new HashSet<>();

    public int getAgeRatingId() {
        return ageRatingId;
    }

    public void setAgeRatingId(int ageRatingId) {
        this.ageRatingId = ageRatingId;
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
