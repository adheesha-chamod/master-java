import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 20),
            new Movie("c", 30)
        );

        // Optional<Integer> sum = movies.stream()
        //                     .map(m -> m.getLikes())
        //                     .reduce((a, b) -> a + b);

        Optional<Integer> sum = movies.stream()
                            .map(m -> m.getLikes())
                            .reduce(Integer::sum);

        System.out.println(sum.orElse(0));
    }    
}