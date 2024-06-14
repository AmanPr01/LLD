package AdvanceLanguageModule.ObjectOrientedProgramming.Inheritance;

public class Car extends Vehicle {

    int year;

    // Constructor with no arguments
    // Constructor chaining
    Car() {
        this("Unknown", 0);
    }

    // Constructor with 1 argument
    // Constructor chaining
    Car(String model) {
        this(model, 0);
    }

    // Sub-Class Constructor, Constructor with 2 argument
    // Constructor chaining from subclass to superclass
    Car(String brand, int year) {
        super(brand);
        this.year = year;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
    }
}
