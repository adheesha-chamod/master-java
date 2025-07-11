class DownloadStatus {
    // Volatile ensures visibility of changes to isDone across threads
    private volatile boolean isDone;
    private long totalBytes;
    private Object totalBytesLock = new Object();

    public void done() {
        isDone = true;
    }

    public boolean isDone() {
        return isDone;
    }

    public void incrementTotalBytes() {
        synchronized(totalBytesLock) {
            totalBytes++;
        }
    }

    public long getTotalBytes() {
        return totalBytes;
    }
}