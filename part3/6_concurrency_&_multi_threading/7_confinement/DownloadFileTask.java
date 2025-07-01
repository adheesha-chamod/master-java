class DownloadFileTask implements Runnable {
    private DownloadStatus downloadStatus;

    DownloadFileTask() {
        // Each downloadTask thread has its own downloadStatus object
        // No shared object among the other threads
        this.downloadStatus = new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println("Downloading a file, thread: " + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {            
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Download interrupted.");
                return;
            }

            downloadStatus.incrementTotalBytes();
        }

        System.out.println("Download complete, thread: " + Thread.currentThread().getName());
    }

    public DownloadStatus getDownloadStatus() {
        return downloadStatus;
    }
}