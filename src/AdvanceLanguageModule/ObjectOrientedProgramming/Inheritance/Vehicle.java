package AdvanceLanguageModule.ObjectOrientedProgramming.Inheritance;

public class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}
