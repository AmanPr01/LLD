package AdvanceLanguageModule.ObjectOrientedProgramming.Abstraction.AbstractClass;

public class Bike extends Vehicle {

    @Override
    void color() {
        System.out.println("Red");
    }

    @Override
    void totalWheels() {
        System.out.println("Bike has 2 wheels.");
    }

    @Override
    void start() {
        System.out.println("Starting Bike.");
    }

    @Override
    void stop() {
        System.out.println("Stopping Bike.");
    }
}
