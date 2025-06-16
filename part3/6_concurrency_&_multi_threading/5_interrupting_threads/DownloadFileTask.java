class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file, thread: " + Thread.currentThread().getName());

        for (int i = 0; i < Integer.MAX_VALUE; i++) {            
            if (Thread.currentThread().isInterrupted()) {
                // If interrupted, exit the thread
                System.out.println("Download interrupted.");
                return;
            }

            System.out.println("Downloading byte: " + i);
        }

        System.out.println("Download complete, thread: " + Thread.currentThread().getName());
    }
}
