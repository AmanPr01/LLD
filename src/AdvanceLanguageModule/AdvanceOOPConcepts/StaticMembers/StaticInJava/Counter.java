package AdvanceLanguageModule.AdvanceOOPConcepts.StaticMembers.StaticInJava;

public class Counter {

    static int count = 0; // Static variable

    Counter() {
        count++;
    }

    // static method
    static void displayCount() {
        System.out.println("Count: " + count);
    }
}
