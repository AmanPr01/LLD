package AdvanceLanguageModule.AdvanceOOPConcepts.AbstractClasses;

public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        dog.sound(); // Outputs: Buddy barks
        dog.eat();   // Outputs: Buddy eats food.

        cat.sound(); // Outputs: Whiskers meows
        cat.eat();   // Outputs: Whiskers eats food.
    }
}
