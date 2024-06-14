package AdvanceLanguageModule.AdvanceOOPConcepts.AbstractClasses;

public class Dog extends Animal {

    // Constructor
    Dog(String name) {
        super(name);
    }

    // Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println(name + " barks");
    }
}
