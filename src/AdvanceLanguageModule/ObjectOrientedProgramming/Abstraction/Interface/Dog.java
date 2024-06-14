package AdvanceLanguageModule.ObjectOrientedProgramming.Abstraction.Interface;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
