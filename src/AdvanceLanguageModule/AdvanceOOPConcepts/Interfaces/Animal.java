package AdvanceLanguageModule.AdvanceOOPConcepts.Interfaces;

public interface Animal {
    // Abstract method (no implementation)
    void sound();

    // Default method (with implementation)
    default void eat() {
        System.out.println("This animal eats food.");
    }

    // Static method (with implementation)
    static void sleep() {
        System.out.println("This animal sleeps.");
    }

    // Constant field
    int numberOfLegs = 4; // implicitly public, static, and final
}


// Static and constant fields are accessed using interface name "Animal".