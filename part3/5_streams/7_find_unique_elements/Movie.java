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
}
