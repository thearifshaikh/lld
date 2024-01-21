package lld.bookMyShow.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    private TheatreController () {
    }

    private static final Map<City, List<Theatre>> cityTheatreMap = new HashMap<>(); // depends on Theatre Object creation or deletion
    private static final Map<Movie, Map<Theatre, Integer>> movieTheatreMapWithShowCount = new HashMap<>(); // whenever shows get created or ended

    public static void addTheatresInCity(Theatre theatre) {
        List<Theatre> theatres = cityTheatreMap.computeIfAbsent(theatre.getCity(), city -> new ArrayList<>());
        theatres.add(theatre);
    }

    public static void addMovieTheatreMapWithShowCount(Theatre theatre, Movie movie) {
        movieTheatreMapWithShowCount
                .computeIfAbsent(movie, k -> new HashMap<>())
                .merge(theatre, 1, Integer::sum);
    }

    public static List<Theatre> getTheatres(City city, Movie movie) {
        List<Theatre> theatres = new ArrayList<>();
        for (Theatre theatre : movieTheatreMapWithShowCount.get(movie).keySet()) {
            if (theatre.getCity()==city) {
                theatres.add(theatre);
            }
        }
        return theatres;
    }
}
