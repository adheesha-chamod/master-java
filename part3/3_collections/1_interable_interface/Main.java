import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            String current = (String) iterator.next();
            System.out.println(current);
        }

        // for(String item: list) {
        //     System.out.println(item);
        // }
    }
}
