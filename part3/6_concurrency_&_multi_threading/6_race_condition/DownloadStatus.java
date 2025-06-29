class DownloadStatus {
    private long totalBytes;

    public long getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        /**
         * Non-atomic operation
         * Involves 3 steps:
         *  - Load the value to the CPU from main memory
         *  - Increment the value by 1
         *  - Write the updated value to the main memory
         */
        totalBytes++;
    }
}
