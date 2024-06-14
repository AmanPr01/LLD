package AdvanceLanguageModule.AdvanceOOPConcepts.Interfaces;

public class Client {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();
        dog.eat();

        // Calling the static method off the interface
        Animal.sleep();

        // Accessing constant fields
        System.out.println("Number of legs: " + Animal.numberOfLegs);
    }
}
