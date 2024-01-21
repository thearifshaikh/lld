package lld.bookMyShow.model;

import java.util.List;

public class Ticket {
    private final Show show;
    private final List<Seat> bookedSeats;
    private final int cost;

    public Ticket(Show show, List<Seat> bookedSeats) {
        this.show = show;
        this.bookedSeats = bookedSeats;

        this.cost = bookedSeats.stream()
                .mapToInt(seat -> seat.getPrice())
                .sum();
    }
}
