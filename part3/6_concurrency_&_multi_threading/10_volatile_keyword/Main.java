class Main {
    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();

        Thread thread1 = new Thread(new DownloadFileTask(status));
        Thread thread2 = new Thread(() -> {
            while (!status.isDone()) {}
            System.out.println("Total bytes: " + status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }
}