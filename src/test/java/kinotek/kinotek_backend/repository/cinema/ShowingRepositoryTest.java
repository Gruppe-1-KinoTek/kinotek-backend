package kinotek.kinotek_backend.repository.cinema;

import kinotek.kinotek_backend.model.cinema.Auditorium;
import kinotek.kinotek_backend.model.cinema.Showing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class ShowingRepositoryTest {

    @Autowired
    private ShowingRepository showingRepository;

    private List<Showing> testShowings;

    @BeforeEach
    void setUp() {
        List<Showing> showings = new ArrayList<>();
        Showing testShowingUpcoming = new Showing();
        Showing testShowingFormer = new Showing();
        testShowingUpcoming.setDateTime(LocalDateTime.now());
        testShowingFormer.setDateTime(LocalDateTime.now().plusDays(-1));


        showings.add(testShowingUpcoming);
        showings.add(testShowingFormer);
        this.testShowings = showings;
        showingRepository.saveAll(showings);


    }

    @Test
    void findAllShowings(){
        assertEquals(testShowings, showingRepository.findAll());
    }

}