package AdvanceLanguageModule.ConcurrencyAndMultithreading.Synchronization.Semaphores;

public class MyThread extends Thread {
    SharedResource resource;
    String threadName;

    public MyThread(SharedResource resource, String threadName) {
        this.resource = resource;
        this.threadName = threadName;
    }

    public void run() {
        resource.accessResource(threadName);
    }

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        MyThread t1 = new MyThread(resource, "Thread 1");
        MyThread t2 = new MyThread(resource, "Thread 2");

        t1.start();
        t2.start();
    }
}
