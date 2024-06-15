package AdvanceLanguageModule.CodingExamples.SynchronizationIssue.WithoutSynchronization;

public class SynchronizationIssueExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count (without synchronization): " + counter.getCount());
    }
}

/*
In this example, Counter is a shared resource accessed by two threads.
Each thread increments the count 1000 times.
Without synchronization, the final count might be less than 2000 due to race conditions.
 */