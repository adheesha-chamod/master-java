import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        // Collection<Integer> list = new ArrayList<>();

        // Create a thread-safe collection using Collections.synchronizedCollection
        Collection<Integer> list = Collections.synchronizedCollection(new ArrayList<>());

        Thread thread1 = new Thread(() -> {
            list.addAll(Arrays.asList(1, 2, 3));
        });

        Thread thread2 = new Thread(() -> {
            list.addAll(Arrays.asList(4, 5, 6));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }
}