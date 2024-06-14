package AdvanceLanguageModule.ConcurrencyAndMultithreading.ConcurrencyVsParallelism.Concurrency;

public class ConcurrencyExample extends Thread {
    private String taskName;

    public ConcurrencyExample(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - iteration " + i);
            try {
                Thread.sleep(100);  // Simulate some work
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new ConcurrencyExample("task1");
        Thread t2 = new ConcurrencyExample("task2");
        t1.start();
        t2.start();
    }
}
