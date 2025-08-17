import java.util.Comparator;

class EmailComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        /*
         * o1 < o2 -> -1
         * o1 == o2 -> 0
         * o1 > o2 -> 1
         */

        return o1.getEmail().compareTo(o2.getEmail());
    }    
}