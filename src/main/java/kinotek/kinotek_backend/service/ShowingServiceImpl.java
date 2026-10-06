package kinotek.kinotek_backend.service;

import kinotek.kinotek_backend.model.cinema.Showing;
import kinotek.kinotek_backend.repository.cinema.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.time.LocalDate;
import java.util.List;

@Service
public class ShowingServiceImpl implements ShowingService{
    private final ShowingRepository showingRepository;

    public ShowingServiceImpl(ShowingRepository showingRepository) {
        this.showingRepository = showingRepository;
    }

    public List<Showing> findAllShowing(){
        return showingRepository.findAll();
    }

    public List<Showing> findShowingByDate(LocalDate dateToFind){
        return showingRepository.findShowingByDate(dateToFind);
    }

}
