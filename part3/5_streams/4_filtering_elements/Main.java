import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

        // movies.stream()
        //     .filter(movie -> movie.getLikes() > 10)
        //     .map(filteredMovie -> filteredMovie.getTitle())
        //     .forEach(title -> System.out.println(title));


        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        Consumer<Movie> printTitle = movie -> System.out.println(movie.getTitle());

        movies.stream()
            .filter(isPopular)
            .forEach(printTitle);
    }    
}
