import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /* map() method */

        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

        /* Using lambda expression */
        movies.stream()
            .map(movie -> movie.getTitle())
            .forEach(title -> System.out.println(title));
        
        /* Using method reference */
        // movies.stream()
        //     .map(Movie::getTitle)
        //     .forEach(System.out::println);


        /* flatMap() method */
        
        Stream<List<Integer>> streamList = Stream.of(
            List.of(1, 2, 3),
            List.of(10, 20, 30)
        );

        // streamList.forEach(list -> System.out.println(list));
        streamList
            .flatMap(list -> list.stream())
            .forEach(n -> System.out.println(n));
    }    
}
