package AdvanceLanguageModule.ConcurrencyAndMultithreading.ProcessVsThread;

public class NumberPrinter extends Thread {
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + number);
    }
}
