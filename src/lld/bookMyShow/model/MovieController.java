package lld.bookMyShow.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MovieController {

    MovieController () {

    }

    private static final Map<City, Map<Movie,Integer>> cityMovieMapWithShowCount = new HashMap<>();

    public static void addCityMovieMapWithShowCount(City city,Movie movie) {
        cityMovieMapWithShowCount
                .computeIfAbsent(city, k -> new HashMap<>())
                .merge(movie, 1, Integer::sum);
    }

    public static Set<Movie> getMovies(City city) {
        return cityMovieMapWithShowCount.get(city).keySet();
    }
}
