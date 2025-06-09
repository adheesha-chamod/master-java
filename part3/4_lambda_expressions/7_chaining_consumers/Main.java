import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");

        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpper = item -> System.out.println(item.toUpperCase());
        Consumer<String> printLower = item -> System.out.println(item.toLowerCase());

        list.forEach(print.andThen(printUpper).andThen(printLower));
    }
}