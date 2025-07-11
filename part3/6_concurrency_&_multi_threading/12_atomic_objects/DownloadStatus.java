import java.util.concurrent.atomic.AtomicLong;

class DownloadStatus {
    // AtomicLong provides thread-safe operations on a long value without explicit synchronization
    private AtomicLong totalBytes = new AtomicLong();

    // Atomically increments totalBytes by 1 (== ++x)
    public void incrementTotalBytes() {
        totalBytes.incrementAndGet();
    }

    // Returns the current value of totalBytes
    public long getTotalBytes() {
        return totalBytes.get();
    }
}
