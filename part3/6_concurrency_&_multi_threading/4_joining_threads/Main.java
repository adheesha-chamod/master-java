class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        /*
         * thread.join() makes the main thread wait until the 'thread' completes.
         * This is called "joining" - the main thread joins and waits for the other thread to finish before continuing.
         * Without join(), the main thread would continue immediately and might print "File is ready to be scanned" before the download finishes.
         */
        try {
            thread.join();
        } catch (InterruptedException e) {
            /*
             * InterruptedException is thrown if the current thread (main thread) is interrupted while waiting for the other thread to complete.
             * This is a checked exception that must be handled.
             */
            e.printStackTrace();
        }
        
        /*
         * This line will only execute AFTER the download thread has completed.
         * The join() ensures proper sequencing - download first, then scan.
         * This demonstrates thread synchronization and coordination.
         */
        System.out.println("File is ready to be scanned");
    }
}