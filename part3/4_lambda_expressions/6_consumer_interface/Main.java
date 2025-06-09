import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        /* Imperative programming */
        // for (int item: list) {
        //     System.out.println(item);
        // }

        /* Declarative programming */
        // list.forEach((Integer item) -> {
        //     System.out.println(item);
        // });

        /* Simplified */
        list.forEach(item -> System.out.println(item));
    }
}