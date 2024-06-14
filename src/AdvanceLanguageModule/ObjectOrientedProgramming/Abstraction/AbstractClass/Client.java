package AdvanceLanguageModule.ObjectOrientedProgramming.Abstraction.AbstractClass;

public class Client {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.color();
        car.totalWheels();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.color();
        bike.totalWheels();
        bike.start();
        bike.stop();
    }
}
