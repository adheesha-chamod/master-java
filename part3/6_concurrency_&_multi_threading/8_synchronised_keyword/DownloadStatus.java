class DownloadStatus {
    private long totalBytes;
    private long totalFiles;

    // Lock object for synchronizing totalBytes updates
    private Object totalBytesLock = new Object();
    // Lock object for synchronizing totalFiles updates
    private Object totalFilesLock = new Object();


    // Thread-safe increment for totalBytes
    public void incrementTotalBytes() {
        synchronized(totalBytesLock) {
            totalBytes++;
        }
    }

    // Thread-safe increment for totalFiles
    public void incrementTotalFiles() {
        synchronized(totalFilesLock) {
            totalFiles++;
        }
    }

    public long getTotalBytes() {
        return totalBytes;
    }

    public long getTotalFiles() {
        return totalFiles;
    }
}