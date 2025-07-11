import java.util.concurrent.atomic.LongAdder;

class DownloadStatus {
    // LongAdder is efficient for high-concurrency scenarios; it reduces contention compared to AtomicLong
    private LongAdder totalBytes = new LongAdder();

    // Increments totalBytes in a thread-safe and highly concurrent manner
    public void incrementTotalBytes() {
        totalBytes.increment();
    }

    // Returns the current value of totalBytes
    public long getTotalBytes() {
        return totalBytes.longValue();
    }
}
