package AdvanceLanguageModule.ObjectOrientedProgramming.Inheritance;

public class Client {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda", 2022);

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
    }
}
