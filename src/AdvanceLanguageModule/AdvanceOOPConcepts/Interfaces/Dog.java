package AdvanceLanguageModule.AdvanceOOPConcepts.Interfaces;

public class Dog implements Animal {

    // Abstract method has to be implemented.
    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }

    @Override
    public void eat() {
        Animal.super.eat();
    }
}
