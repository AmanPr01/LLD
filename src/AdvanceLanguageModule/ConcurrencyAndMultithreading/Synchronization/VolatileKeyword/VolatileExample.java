package AdvanceLanguageModule.ConcurrencyAndMultithreading.Synchronization.VolatileKeyword;

public class VolatileExample extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running....");
        }
        System.out.println("Thread is stopped...");
    }

    public void stopRunning() {
        running = false;
    }

    public static void main(String[] args) {
        VolatileExample thread = new VolatileExample();
        thread.start();
        try {
            Thread.sleep(1);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.stopRunning();
    }
}
