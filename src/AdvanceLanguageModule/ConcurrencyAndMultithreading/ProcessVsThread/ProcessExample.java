package AdvanceLanguageModule.ConcurrencyAndMultithreading.ProcessVsThread;

// Process Example
// Running this code simulates running different Java programs as separate processes
public class ProcessExample {
    public static void main(String[] args) {
        System.out.println("Process: " + ProcessHandle.current().pid());
        // Simulating separate process execution
        // Each process has its own memory space and execution context
    }
}
