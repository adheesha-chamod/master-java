import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");
        Predicate<String> hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);
        Predicate<String> hasLeftOrRightBrace = hasLeftBrace.or(hasRightBrace);

        boolean res1 = hasLeftAndRightBrace.test("{sky}");
        boolean res2 = hasLeftOrRightBrace.test("sky");

        System.out.println(res1);
        System.out.println(res2);
    }
}