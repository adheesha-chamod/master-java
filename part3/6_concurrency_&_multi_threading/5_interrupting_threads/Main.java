class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }        
        
        // After 1 second, interrupt the download thread
        thread.interrupt();
    }
}