import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        DownloadStatus downloadStatus = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();

        // Starting threads
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(downloadStatus));
            thread.start();
            threads.add(thread);
        }

        // Waiting for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Expected result: 10 * 10,000 => 100,000
        // But it will never occur due to race-condition 
        System.out.println("Total no. of bytes downloaded: " + downloadStatus.getTotalBytes());
    }
}