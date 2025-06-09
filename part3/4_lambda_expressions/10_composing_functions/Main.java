import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // str -> "key:value"
        // 1st -> "key=value"
        // 2nd -> "{key=value}"

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        // 1st way -> Declarative programming
        String res1 = replaceColon
        .andThen(addBraces)
        .apply("key:value");
        
        System.out.println(res1);

        // 2nd way
        String res2 = addBraces
        .compose(replaceColon)
        .apply("key:value");

        System.out.println(res2);
    }
}