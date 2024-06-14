package AdvanceLanguageModule.AdvanceOOPConcepts.AbstractClasses;

public class Cat extends Animal {

    // Constructor
    Cat(String name) {
        super(name);
    }

    // Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println(name + " meows");
    }
}
