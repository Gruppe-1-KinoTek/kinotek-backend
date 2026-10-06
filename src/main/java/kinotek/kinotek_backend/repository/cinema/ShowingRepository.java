package kinotek.kinotek_backend.repository.cinema;

import kinotek.kinotek_backend.model.cinema.Showing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface ShowingRepository extends JpaRepository<Showing, Integer> {

    @Query("select showing from Showing showing where showing. and date(showing.dateTime) like ?1")
    public List<Showing> findShowingByDate(LocalDate date);

}
