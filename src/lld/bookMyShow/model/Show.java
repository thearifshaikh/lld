package lld.bookMyShow.model;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private Movie movie;
    private int startTime;
    private Screen screen;
    private List<Seat> seats;

    public Show(Movie movie, int startTime, Screen screen, int price) {
        this.movie = movie;
        this.startTime = startTime;
        this.screen = screen;
        seats = new ArrayList<>();

        for(Seat seat:this.screen.getSeats()) {
            this.seats.add(seat.clone(price));
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public synchronized Ticket bookSeats(List<Seat> bookingSeats) {
        for (Seat seat: bookingSeats) {
            if(seat.isOccupied()) throw new RuntimeException("already occupied");
        }

        for (Seat seat: bookingSeats) {
            seat.setOccupied(true);
        }

        return new Ticket(this, bookingSeats);
    }
}
