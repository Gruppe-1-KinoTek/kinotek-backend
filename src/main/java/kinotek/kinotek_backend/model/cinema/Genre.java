package kinotek.kinotek_backend.model.cinema;


import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Genre {

    @Id
    private int genreId;
    private String genreName;

    @ManyToMany(mappedBy = "genres")
    Set<Movie> movies;

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}
