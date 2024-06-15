package AdvanceLanguageModule.CodingExamples.MultithreadedProgram.Thread;

public class MultiThreadExample1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            MyThread thread = new MyThread(i);
            thread.start();
        }
    }
}
