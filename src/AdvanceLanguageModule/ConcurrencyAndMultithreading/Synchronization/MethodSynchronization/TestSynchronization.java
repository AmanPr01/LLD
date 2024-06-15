package AdvanceLanguageModule.ConcurrencyAndMultithreading.Synchronization.MethodSynchronization;

public class TestSynchronization {
    public static void main(String[] args) {
        Table table = new Table();  // Only one object
        MyThread1 t1 = new MyThread1(table);
        MyThread2 t2 = new MyThread2(table);

        t1.start();
        t2.start();
    }
}
