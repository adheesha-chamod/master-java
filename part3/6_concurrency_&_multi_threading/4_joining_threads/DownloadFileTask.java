class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file, thread: " + Thread.currentThread().getName());

        // pause thread for 5000 ms
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download complete, thread: " + Thread.currentThread().getName());
    }
}
