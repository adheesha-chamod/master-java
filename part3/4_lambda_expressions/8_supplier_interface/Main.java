import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Supplier<Double> getRandom = () -> {
        //     return Math.random();
        // };

        Supplier<Double> getRandom = () -> Math.random();

        System.out.println(getRandom.get());
    }
}