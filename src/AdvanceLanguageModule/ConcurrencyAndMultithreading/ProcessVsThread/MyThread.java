package AdvanceLanguageModule.ConcurrencyAndMultithreading.ProcessVsThread;

// Thread Example
// Running this code demonstrates creating and running threads within the same process
public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getId());
    }
}
