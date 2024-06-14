package AdvanceLanguageModule.AdvanceOOPConcepts.Interfaces;

public class Dog implements Animal {

    // Only abstract method has implementation
    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }

    @Override
    public void eat() {
        Animal.super.eat();
    }
}
