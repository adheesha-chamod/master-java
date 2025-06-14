import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Creating stream from collection (list)
        List<String> list = new ArrayList<>();
        list.stream();

        // Creating stream from array
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers)
            .forEach(n -> System.out.println(n));

        // Creating stream from arbitrary number od objects
        // 1st way
        Stream.of(1, 2, 3);
        // 2nd way
        Stream.iterate(1, n -> n + 1);

        // Generating infinite streams
        Stream.generate(() -> Math.random());   // generate infinite stream of random numbers

        // Limiting
        Stream<Double> random = Stream.generate(() -> Math.random());
        random
            .limit(3)
            .forEach(n -> System.out.println(n));
    }    
}
