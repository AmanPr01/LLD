package AdvanceLanguageModule.CodingExamples.MultithreadedProgram.Runnable;

public class MyRunnable implements Runnable {
    private int threadNumber;

    public MyRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " is running");
    }

}
