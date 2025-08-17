class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("{Customer: %s, %s}", name, email);
    }

    @Override
    public int compareTo(Customer other) {
        /*
         * this < other -> -1
         * this == other -> 0
         * this > other -> 1
         */

        return name.compareTo(other.name);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
