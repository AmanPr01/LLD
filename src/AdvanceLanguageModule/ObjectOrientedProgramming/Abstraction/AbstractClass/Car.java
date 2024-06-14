package AdvanceLanguageModule.ObjectOrientedProgramming.Abstraction.AbstractClass;

public class Car extends Vehicle {

    @Override
    void color() {
        System.out.println("Blue");
    }

    @Override
    void totalWheels() {
        System.out.println("Car has 4 wheels.");
    }

    @Override
    void start() {
        System.out.println("Started the car.");
    }

    @Override
    void stop() {
        System.out.println("Stopped the car.");
    }
}
