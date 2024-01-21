package lld.bookMyShow;

import lld.bookMyShow.model.City;
import lld.bookMyShow.model.Movie;
import lld.bookMyShow.model.MovieController;
import lld.bookMyShow.model.Screen;
import lld.bookMyShow.model.Seat;
import lld.bookMyShow.model.Show;
import lld.bookMyShow.model.Theatre;
import lld.bookMyShow.model.TheatreController;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        City city = new City("Guwahati");

        Movie movie1 = new Movie("Jawan", 180);
        Movie movie2 = new Movie("Pathan", 240);

        Seat seat1 = new Seat(1, false, 100);
        Seat seat2 = new Seat(2, false, 150);

        Seat seat3 = new Seat(3, false, 100);
        Seat seat4 = new Seat(4, false, 200);

        Seat seat5 = new Seat(5, false, 100);
        Seat seat6 = new Seat(6, false, 300);

        Screen screen1 = new Screen(1);
        screen1.addSeat(seat1);
        screen1.addSeat(seat2);

        Screen screen2 = new Screen(2);
        screen1.addSeat(seat3);
        screen1.addSeat(seat4);

        Screen screen3 = new Screen(3);
        screen1.addSeat(seat6);
        screen1.addSeat(seat5);

        Theatre pvr = new Theatre.Builder(city, "PVR").build();
        pvr.addScreen(screen1);
        pvr.addScreen(screen2);

        Show show1 = new Show(movie1, 1705002770, screen1, 20000);
        Show show2 = new Show(movie2, 1705002770, screen2, 1000);
        pvr.addShow(show1);
        pvr.addShow(show2);


        Theatre inox = new Theatre.Builder(city, "INOX").build();
        inox.addScreen(screen3);
        Show show3 = new Show(movie1, 1705002770, screen3, 50000);
        inox.addShow(show3);


        Set<Movie> movies = MovieController.getMovies(city);
        for(Movie movie:movies) {
            System.out.println(movie.getMovieName());
        }
        List<Theatre> theatres = TheatreController.getTheatres(city, movie2);
        for(Theatre theatre:theatres) {
            System.out.println(theatre.getName());
        }
    }
}
