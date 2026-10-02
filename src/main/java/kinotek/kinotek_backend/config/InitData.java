package kinotek.kinotek_backend.config;

import kinotek.kinotek_backend.repository.cinema.*;
import kinotek.kinotek_backend.repository.user.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    private final AgeRatingRepository ageRatingRepository;
    private final AuditoriumRepository auditoriumRepository;
    private final BookingRepository bookingRepository;
    private final GenreRepository genreRepository;
    private final InvoiceRepository invoiceRepository;
    private final MovieRepository movieRepository;
    private final SeatRepository seatRepository;
    private final SeatRowRepository seatRowRepository;
    private final ShowingRepository showingRepository;
    private final CustomerRepository customerRepository;

    public InitData(AgeRatingRepository ageRatingRepository,
                    AuditoriumRepository auditoriumRepository,
                    BookingRepository bookingRepository,
                    GenreRepository genreRepository,
                    InvoiceRepository invoiceRepository,
                    MovieRepository movieRepository,
                    SeatRepository seatRepository,
                    SeatRowRepository seatRowRepository,
                    ShowingRepository showingRepository,
                    CustomerRepository customerRepository) {
        this.ageRatingRepository = ageRatingRepository;
        this.auditoriumRepository = auditoriumRepository;
        this.bookingRepository = bookingRepository;
        this.genreRepository = genreRepository;
        this.invoiceRepository = invoiceRepository;
        this.movieRepository = movieRepository;
        this.seatRepository = seatRepository;
        this.seatRowRepository = seatRowRepository;
        this.showingRepository = showingRepository;
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
