package AdvanceLanguageModule.ObjectOrientedProgramming.Polymorphism.MethodOverriding;

public class Cat extends Animal {

    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
