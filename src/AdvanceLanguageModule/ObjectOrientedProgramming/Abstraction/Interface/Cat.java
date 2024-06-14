package AdvanceLanguageModule.ObjectOrientedProgramming.Abstraction.Interface;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
