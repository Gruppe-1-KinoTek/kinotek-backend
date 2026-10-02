package kinotek.kinotek_backend.model.cinema;

import jakarta.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "seat", referencedColumnName = "seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "showing", referencedColumnName = "showing_id")
    private Showing showing;

    @ManyToOne
    @JoinColumn(name = "order", referencedColumnName = "order_id")
    private Order order;

    //GETTERS
    public Seat getSeat() {return seat;}
    public Showing getShowing() {return showing;}
    public Order getOrder() {return order;}


    //SETTERS
    public void setSeat(Seat seat) {this.seat = seat;}
    public void setShowing(Showing showing) {this.showing = showing;}
    public void setOrder(Order order) {this.order = order;}

    @Override
    public String toString() {
        return "Booking{" +
                "seat=" + seat +
                ", showing=" + showing +
                ", order=" + order +
                '}';
    }
}
