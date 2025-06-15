class Main {
    public static void main(String[] args) {
        /*
         * Thread.activeCount() returns the number of active threads in the current thread's thread group and its subgroups.
         * Output: 1 - This represents the main thread that is currently running.
         * When a Java program starts, it creates the main thread to execute the main() method.
         */
        System.out.println(Thread.activeCount());
        
        /*
         * Runtime.getRuntime().availableProcessors() returns the number of processors (CPU cores) available to the Java Virtual Machine.
         * Output: 8 - This means your system has 8 CPU cores available.
         * This number can be used to determine optimal thread pool sizes for parallel processing tasks.
         */
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}