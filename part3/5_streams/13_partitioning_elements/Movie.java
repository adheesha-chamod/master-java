import java.util.Objects;

class Movie implements Comparable<Movie> {
    private String title;
    private int likes;
    private Genre genre;

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
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
        return title;
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
        return (likes == movie.likes) 
                    && Objects.equals(title, movie.title)
                    && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, likes, genre);
    }
}
