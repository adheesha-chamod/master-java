import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C", "e1"));
        customers.add(new Customer("A", "e3"));
        customers.add(new Customer("B", "e2"));

        System.out.println(customers);

        // sort by name
        Collections.sort(customers);
        System.out.println(customers);

        // sort by email
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }    
}