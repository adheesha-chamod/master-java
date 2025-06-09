import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> map = str -> str.length();
        
        System.out.println(map.apply("Hi"));
    }
}