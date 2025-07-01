import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        // Starting threads
        for (int i = 0; i < 10; i++) {
            DownloadFileTask task = new DownloadFileTask();
            tasks.add(task);

            Thread thread = new Thread(task);
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

        // Combining result from objects
        long totalBytes = tasks.stream()
                    .map(t -> t.getDownloadStatus().getTotalBytes())
                    .reduce(0L, (a, b) -> a + b);

        // Expected result: 10 * 10,000 => 100,000
        System.out.println("Total no. of bytes downloaded: " + totalBytes);
    }
}