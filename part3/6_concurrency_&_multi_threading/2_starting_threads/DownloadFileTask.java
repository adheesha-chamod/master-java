class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file, thread: " + Thread.currentThread().getName());
    }
}
