import java.util.Objects;

public class Movie implements Comparable<Movie> {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    /*
     * Sort based on the likes
     * Consider the descending order
     */
    @Override
    public int compareTo(Movie other) {
        return Integer.compare(other.likes, this.likes);
    }

    @Override
    public String toString() {
        return String.format("%s:%d", title, likes);
    }    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Movie movie = (Movie) obj;
        return (likes == movie.likes) && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, likes);
    }
}
