package AdvanceLanguageModule.AdvanceOOPConcepts.AbstractClasses;

public abstract class Animal {
    // Instance variable
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method (with implementation)
    void eat() {
        System.out.println(name + " eats food.");
    }
}
