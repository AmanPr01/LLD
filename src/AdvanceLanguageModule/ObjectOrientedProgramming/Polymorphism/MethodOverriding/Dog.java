package AdvanceLanguageModule.ObjectOrientedProgramming.Polymorphism.MethodOverriding;

public class Dog extends Animal {

    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
