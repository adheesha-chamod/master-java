class Main {
    public static void main(String[] args) {
        /*
         * Thread.activeCount() returns the number of active threads in the current thread's thread group and its subgroups.
         * The output represents the main thread that is currently running.
         * When a Java program starts, it creates the main thread to execute the main() method.
         */
        System.out.println(Thread.activeCount());
        
        /*
         * Runtime.getRuntime().availableProcessors() returns the number of processors (CPU cores) available to the Java Virtual Machine.
         * The output represents the count of CPU cores available in your machine.
         * This number can be used to determine optimal thread pool sizes for parallel processing tasks.
         */
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}