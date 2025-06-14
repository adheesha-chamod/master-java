import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10, Genre.THRILLER),
            new Movie("b", 20, Genre.ACTION),
            new Movie("c", 30, Genre.ACTION)
        );

        Map<Boolean, List<Movie>> result = movies.stream()
                        .collect(Collectors.partitioningBy(m -> m.getLikes() > 10));
        System.out.println(result);
    }    
}