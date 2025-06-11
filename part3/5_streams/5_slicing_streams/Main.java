import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20),
            new Movie("d", 25),
            new Movie("e", 30)
        );

        /* limit(n) */
        movies.stream()
            .limit(2)
            .forEach(m -> System.out.println(m.getTitle()));

        /* skip(n) */
        movies.stream()
            .skip(3)
            .forEach(m -> System.out.println(m.getTitle()));

        /* takeWhile(predicate) */
        movies.stream()
            .takeWhile(m -> m.getLikes() <= 20)
            .forEach(m -> System.out.println(m.getTitle()));

        /* dropWhile(predicate) */
        movies.stream()
            .dropWhile(m -> m.getLikes() <= 25)
            .forEach(m -> System.out.println(m.getTitle()));
    }    
}
