public class Main {
    public static void main(String[] args) {
        // greet(new ConsolePrinter());

        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello world!");
    }
}