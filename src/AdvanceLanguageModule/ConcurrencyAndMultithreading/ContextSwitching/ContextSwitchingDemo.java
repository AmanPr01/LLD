package AdvanceLanguageModule.ConcurrencyAndMultithreading.ContextSwitching;

public class ContextSwitchingDemo extends Thread {

    private String threadName;

    public ContextSwitchingDemo(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - iteration " + i);
            try {
                Thread.sleep(50); // Simulate some work and allow context switching
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new ContextSwitchingDemo("Thread 1");
        Thread t2 = new ContextSwitchingDemo("Thread 2");

        t1.start();
        t2.start();
    }
}

/*
The example I provided demonstrates preemptive multitasking,
where the operating system decides when to switch between threads (preempting their execution).
*/
