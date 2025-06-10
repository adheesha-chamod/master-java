import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // n -> n + 1 -> n * n

        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        int res = increment.andThen(square).apply(2);

        System.out.println(res);
    }
}