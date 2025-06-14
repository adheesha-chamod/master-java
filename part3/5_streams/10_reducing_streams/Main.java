import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 20),
            new Movie("c", 30)
        );

        /* counting */
        long count = movies.stream().count();
        System.out.println(count);


        /* matchers */
        boolean isAnyLikesMoreThan50 = movies.stream().anyMatch(m -> m.getLikes() > 50);
        System.out.println(isAnyLikesMoreThan50);

        boolean isNoneLikesMoreThan50 = movies.stream().noneMatch(m -> m.getLikes() > 50);
        System.out.println(isNoneLikesMoreThan50);

        boolean isAllLikesMoreThan5 = movies.stream().allMatch(m -> m.getLikes() > 5);
        System.out.println(isAllLikesMoreThan5);


        /* finders */
        Optional<Movie> popular1 = movies.stream().sorted().findFirst();
        System.out.println(
            popular1.isPresent() ? popular1.get().getTitle() : "null"
        );
        
        Optional<Movie> anyZeroPopular = movies.stream()
                            .filter(m -> m.getLikes() == 0)
                            .findAny();
        System.out.println(
            anyZeroPopular.isPresent() ? anyZeroPopular.get().getTitle() : "null"
        );

        
        /* max, min */
        Optional<Movie> popular2 = movies.stream()
                            .max(Comparator.comparing(m -> m.getLikes()));
        System.out.println(
            popular2.isPresent() ? popular2.get().getTitle() : "null"
        );

        Optional<Movie> leastPopular = movies.stream()
                            .min(Comparator.comparing(m -> m.getLikes()));
        System.out.println(
            leastPopular.isPresent() ? leastPopular.get().getTitle() : "null"
        );
    }    
}