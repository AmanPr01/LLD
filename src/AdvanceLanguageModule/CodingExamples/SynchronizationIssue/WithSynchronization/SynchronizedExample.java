package AdvanceLanguageModule.CodingExamples.SynchronizationIssue.WithSynchronization;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count (with synchronization): " + counter.getCount());
    }
}

/*
In this example, the increment method is synchronized,
ensuring that only one thread can increment the count at a time.
This eliminates the race condition, and the final count will always be 2000.
 */