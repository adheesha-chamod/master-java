import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // add an elements
        collection.add("A");
        collection.add("B");
        collection.add("C");

        // add multiple elements
        Collections.addAll(collection, "P", "Q", "R");

        // add another collection
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        // remove an element
        collection.remove("A");
        collection.remove("Z");     // not throw any error

        // get size
        System.out.println(collection.size());

        // check existence of an element
        System.out.println(collection.contains("Z"));

        // convert collection to array
        String[] stringArray = collection.toArray(new String[0]);   // no need to pass the size, java will determine the size, but common convention is to pass 0
        System.out.println(stringArray.length);

        // compare collections
        System.out.println(collection.equals(other));

        // print collection
        System.out.println(collection);

        // clear collection
        collection.clear();

        // check is empty
        System.out.println(collection.isEmpty());
    }    
}