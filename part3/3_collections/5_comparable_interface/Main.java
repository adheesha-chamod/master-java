import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C"));
        customers.add(new Customer("A"));
        customers.add(new Customer("B"));

        System.out.println(customers);

        Collections.sort(customers);
        System.out.println(customers);
    }    
}