package AdvanceLanguageModule.ConcurrencyAndMultithreading.Synchronization.Semaphores;

import java.util.concurrent.Semaphore;

public class SharedResource {
    private Semaphore semaphore = new Semaphore(1); // Binary semaphore

    public void accessResource(String threadName) {
        try {
            semaphore.acquire();
            System.out.println(threadName + " acquired the semaphore.");
            // Simulate resource access
            Thread.sleep(1000);
            System.out.println(threadName + " released the semaphore.");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
    }
}
