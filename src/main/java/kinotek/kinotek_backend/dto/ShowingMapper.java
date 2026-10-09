package kinotek.kinotek_backend.dto;

import kinotek.kinotek_backend.model.cinema.Showing;
import org.springframework.stereotype.Component;

@Component
public class ShowingMapper {
    public ShowingDTO showingToDto(Showing showing){
        ShowingDTO showingDTO = new ShowingDTO();
        showingDTO.setId(showing.getId());
        showingDTO.setAuditorium(showing.getAuditorium().getAuditoriumName());
        showingDTO.setDateTime(showing.getDateTime());
        return showingDTO;
    }

}
