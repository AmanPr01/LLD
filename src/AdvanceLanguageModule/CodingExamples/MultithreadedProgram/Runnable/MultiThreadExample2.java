package AdvanceLanguageModule.CodingExamples.MultithreadedProgram.Runnable;

public class MultiThreadExample2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Runnable runnable = new MyRunnable(i);
            runnable.run();
        }
    }
}
