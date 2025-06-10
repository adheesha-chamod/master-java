import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // a, b -> a + b -> a^2

        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = n -> n * n;

        int res = add.andThen(square).apply(2, 3);

        System.out.println(res);
    }
}