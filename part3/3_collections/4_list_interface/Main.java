import java.util.ArrayList;
import java.util.List;
class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        // add an element to specific location
        list.add(1, "P");
        System.out.println(list);

        // get an element by index
        System.out.println(list.get(1));

        // replace an element from specific location
        list.set(2, "Q");
        System.out.println(list);

        // get the index of the first occurrence of a specific element
        System.out.println(list.indexOf("Z"));  // -1 if not found

        // get the index of the last occurrence of a specific element
        System.out.println(list.lastIndexOf("Z"));

        // remove element in specific location
        list.remove(0);
        System.out.println(list);

        // remove specified element
        list.remove("Z");
        System.out.println(list);

        // get the sub-list
        List<String> sub = list.subList(1, 3);  // from is inclusive, to is exclusive
        System.out.println(sub);
    }    
}