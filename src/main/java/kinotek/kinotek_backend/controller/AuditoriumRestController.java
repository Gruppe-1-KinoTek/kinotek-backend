package kinotek.kinotek_backend.controller;

import kinotek.kinotek_backend.repository.cinema.AuditoriumRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auditoriums")
@CrossOrigin
public class AuditoriumRestController {

    record AuditoriumDto(int id, String name) {}

    private final AuditoriumRepository auditoriumRepository;

    public AuditoriumRestController(AuditoriumRepository auditoriumRepository) {
        this.auditoriumRepository = auditoriumRepository;
    }

    @GetMapping
    public List<AuditoriumDto> getAuditoriums() {
        return auditoriumRepository.findAll().stream()
                .map(a -> new AuditoriumDto(a.getId(), a.getAuditoriumName()))
                .toList();
    }
}