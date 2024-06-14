package AdvanceLanguageModule.ConcurrencyAndMultithreading.ProcessVsThread;

public class PrintNumberWithThreads {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            Thread thread = new NumberPrinter(i);
            thread.setName("Thread-" + i);  // Set the thread name
            thread.start();
        }
    }
}
