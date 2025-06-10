import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isLoongerThan5 = str -> str.length() > 5;

        boolean res1 = isLoongerThan5.test("sky");
        boolean res2 = isLoongerThan5.test("director");

        System.out.println(res1);
        System.out.println(res2);
    }
}