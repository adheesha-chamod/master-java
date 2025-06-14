import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 20),
            new Movie("c", 30)
        );

        movies.stream()
            .filter(m -> m.getLikes() > 10)
            .peek(m -> System.out.println("Filtered: " + m.getTitle()))     // peeking
            .map(m -> m.getTitle())
            .peek(t -> System.out.println("Mapped: " + t))                  // peeking
            .forEach(t -> System.out.println(t));        
    }    
}
