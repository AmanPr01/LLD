package AdvanceLanguageModule.ExceptionHandlingAndMemoryManagement.MemoryManagement;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Object(); // Creating object
        }

        System.gc(); // Requesting GC

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());
        System.out.println("Used Memory: " + (runtime.totalMemory() - runtime.freeMemory()));
    }
}
