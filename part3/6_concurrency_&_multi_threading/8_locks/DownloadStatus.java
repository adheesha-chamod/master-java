import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DownloadStatus {
    private long totalBytes;
    
    /**
     * ReentrantLock provides explicit locking mechanism for thread synchronization
     * "Reentrant" means the same thread can acquire the lock multiple times
    */
    private Lock lock = new ReentrantLock();

    public long getTotalBytes() {
        return totalBytes;
    }

    /**
     * Increments the total bytes counter in a thread-safe manner
     * Uses explicit locking to ensure atomic operation across multiple threads
     */
    public void incrementTotalBytes() {
        // Acquire the lock - blocks if another thread holds it
        lock.lock();
        
        try {
            // Critical section: only one thread can execute this at a time
            // This increment operation is now atomic and thread-safe
            totalBytes++;
        } finally {
            // Always release the lock in finally block to prevent deadlocks
            // Even if an exception occurs, the lock will be released
            lock.unlock();
        }
    }
}