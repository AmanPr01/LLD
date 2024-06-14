package AdvanceLanguageModule.ObjectOrientedProgramming.Polymorphism.MethodOverriding;

public class Client {
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}
