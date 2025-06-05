public class Main {
    public static void main(String[] args) {
        String prefix = "$";

        greet(message -> System.out.println(prefix + message));
    }

    public static void greet(Printer printer) {
        printer.print("Hello world!");
    }
}