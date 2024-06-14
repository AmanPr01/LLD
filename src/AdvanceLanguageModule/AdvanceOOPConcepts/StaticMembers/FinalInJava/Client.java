package AdvanceLanguageModule.AdvanceOOPConcepts.StaticMembers.FinalInJava;

public class Client {
    public static void main(String[] args) {
        // Using a final variable
        System.out.println("Max Value: " + Constants.MAX_VALUE);

        // Using a final method
        Dog dog = new Dog();
        dog.makeSound(); // Outputs: Animal makes a sound

        // Using a final class
        ImmutableClass immutable = new ImmutableClass("Final Example");
        System.out.println("Name: " + immutable.getName());
    }
}
