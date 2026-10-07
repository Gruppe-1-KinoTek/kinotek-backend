package kinotek.kinotek_backend.service;

import kinotek.kinotek_backend.model.cinema.Movie;
import kinotek.kinotek_backend.model.cinema.Showing;
import kinotek.kinotek_backend.repository.cinema.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.time.LocalDate;
import java.util.ArrayList;
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

    public Showing findShowingById(int id){
        return showingRepository.getReferenceById(id);
    }

    public List<Showing> findShowingByMovieAndDate(Movie movie, LocalDate dateToFind){
        List<Showing> allShowings = showingRepository.findByMovie(movie);
        List<Showing> showingsToReturn = new ArrayList<>();

        for(Showing showing: allShowings){
            if(showing.getDateTime().toLocalDate().isEqual(dateToFind)){
                showingsToReturn.add(showing);
            }
        }

        return showingsToReturn;
    }

    public List<Showing> findUpcomingShowing(){
        List<Showing> allShowings = showingRepository.findAll();
        List<Showing> showingsToReturn = new ArrayList<>();

        for(Showing showing: allShowings){
            LocalDate showingDate = showing.getDateTime().toLocalDate();
            LocalDate currentDate = LocalDate.now();
            if(showingDate.isAfter(currentDate) || showingDate.isEqual(currentDate)){
                showingsToReturn.add(showing);
            }
        }
        return showingsToReturn;
    }

    public void saveShowing(Showing showing){
        showingRepository.save(showing);
    }

    public void deleteShowing(Showing showing){
        showingRepository.delete(showing);
    }

    public void deleteShowingById(int id){
        deleteShowing(findShowingById(id));
    }

}
