class Main {
    public static void main(String[] args) {
        System.out.println("Thread: " + Thread.currentThread().getName());

        /*
         * These tasks will be execute in separate threads
         * Not in main thread
         */
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}