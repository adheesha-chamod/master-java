import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 20),
            new Movie("c", 30)
        );

        // toList()
        List<Movie> resultList = movies.stream()
                    .filter(m -> m.getLikes() > 10)
                    .collect(Collectors.toList());
        System.out.println(resultList);

        /**
         * For Set to work as expected, we have to implement the equals() and hashCode() methods in Movie class
         */
        // toSet()
        Set<Movie> resultSet = movies.stream()
                    .filter(m -> m.getLikes() > 10)
                    .collect(Collectors.toSet());
        System.out.println(resultSet);

        // toMap()
        Map<String, Movie> resultMap = movies.stream()
                    .filter(m -> m.getLikes() > 10)
                    // .collect(Collectors.toMap(m -> m.getTitle(), m -> m));
                    .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(resultMap);

        // joining()
        String resultJoin = movies.stream()
                    .filter(m -> m.getLikes() > 10)
                    .map(m -> m.getTitle())
                    .collect(Collectors.joining(", "));
        System.out.println(resultJoin);
    }    
}