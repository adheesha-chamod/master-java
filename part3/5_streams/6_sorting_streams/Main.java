import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("d", 35),
            new Movie("c", 20),
            new Movie("a", 10),
            new Movie("e", 15),
            new Movie("b", 25)
        );

        /*
         * Using default sorting criteria
         * Specify in Movie class 
         * Using compare method from Comparable interface
         */
        movies.stream()
            .sorted()
            .forEach(m -> System.out.println(m.getTitle()));

        /*
         * Using specific criteria  
         * Customizable
         */
        movies.stream()
            // .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
            .sorted(Comparator.comparing(m -> m.getTitle()))
            .forEach(m -> System.out.println(m.getTitle()));

        // Descending order
        movies.stream()
            .sorted(Comparator.comparing((Movie m) -> m.getTitle()).reversed())
            .forEach(m -> System.out.println(m.getTitle()));
    }    
}
