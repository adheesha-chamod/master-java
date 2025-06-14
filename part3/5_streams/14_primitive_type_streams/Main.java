import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0, 3)
            .forEach(n -> System.out.println(n));

        IntStream.rangeClosed(0, 3)
            .forEach(n -> System.out.println(n));
    }    
}