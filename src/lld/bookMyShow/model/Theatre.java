package lld.bookMyShow.model;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private final String name;
    private final City city;
    private final List<Show> shows;
    private final List<Screen> screens;

    public Theatre(Builder builder) {
        this.name = builder.name;
        this.city = builder.city;
        shows = new ArrayList<>();
        screens = new ArrayList<>();
    }

    public City getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public List<Show> getShows() {
        return shows;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void addScreen(Screen screen) {
        this.screens.add(screen);
    }

    public void addShow(Show show) {
        this.shows.add(show);
        MovieController.addCityMovieMapWithShowCount(this.city, show.getMovie());
        TheatreController.addMovieTheatreMapWithShowCount(this, show.getMovie());
    }

    public static class Builder {
        private String name;
        private City city;

        public Builder(City city, String name) {
            this.name = name;
            this.city = city;
        }

        public Theatre build() {
            Theatre theatre = new Theatre(this);
            TheatreController.addTheatresInCity(theatre);
            return theatre;
        }
    }
}
