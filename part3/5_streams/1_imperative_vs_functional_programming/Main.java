import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

        // imperative programming
        int count1 = 0;
        for (Movie movie : movies) {
            if (movie.getLikes() > 10) {
                count1++;
            }
        }
        System.out.println(count1);

        // declarative (functional) programming
        long count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

        System.out.println(count2);
    }    
}
