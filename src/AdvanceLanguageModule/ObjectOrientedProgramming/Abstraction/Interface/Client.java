package AdvanceLanguageModule.ObjectOrientedProgramming.Abstraction.Interface;

public class Client {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();

        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}
