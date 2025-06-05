public class Main {
    public static void main(String[] args) {
        // greet(message -> System.out.println(message));

        /*
         * method reference
         * format: <class/object>::<method_name>
         */
        greet(System.out::println);
    }

    public static void greet(Printer printer) {
        printer.print("Hello world!");
    }
}