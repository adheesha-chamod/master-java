import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String current = (String) iterator.next();
            System.out.println(current);
        }

        /* or using for-each loop */
        // for(String item: list) {
        //     System.out.println(item);
        // }
    }
}
