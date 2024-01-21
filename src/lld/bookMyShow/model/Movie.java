package lld.bookMyShow.model;

public class Movie {
    private String movieName;
    private int duration;

    public Movie(String movieName, int duration) {
        this.movieName = movieName;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
