class DownloadFileTask implements Runnable {
    private DownloadStatus downloadStatus;

    DownloadFileTask(DownloadStatus downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file, thread: " + Thread.currentThread().getName());

        for (int i = 0; i < 1_000_000; i++) {            
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Download interrupted.");
                return;
            }

            downloadStatus.incrementTotalBytes();
        }

        downloadStatus.done();

        System.out.println("Download complete, thread: " + Thread.currentThread().getName());
    }
}
