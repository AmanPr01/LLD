package AdvanceLanguageModule.CodingExamples.MultithreadedProgram.Thread;

public class MyThread extends Thread {
    private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " is running");
    }
}
