import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 35),
            new Movie("a", 35),
            new Movie("b", 20),
            new Movie("b", 20),
            new Movie("c", 15)
        );

        movies.stream()
            .map(m -> m.getTitle())
            .distinct()
            .forEach(title -> System.out.println(title));        
    }    
}
