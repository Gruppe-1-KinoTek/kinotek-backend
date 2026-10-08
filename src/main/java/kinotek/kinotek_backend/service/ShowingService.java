package kinotek.kinotek_backend.service;

import kinotek.kinotek_backend.dto.SeatMapDto;

public interface ShowingService {

    public SeatMapDto getSeatMap(int showingId);
}
