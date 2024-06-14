package AdvanceLanguageModule.ObjectOrientedProgramming.Encapsulation;

public class ClientPerson {
    public static void main(String[] args) {
        // Creating a Person object using constructor
        Person person = new Person("Alice", 30);

        // Using getters to access state
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Using setters to modify state
        person.setName("Bob");
        person.setAge(25);
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
