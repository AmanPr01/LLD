package AdvanceLanguageModule.ObjectOrientedProgramming.Polymorphism.MethodOverloading;

public class Client {
    public static void main(String[] args) {

        MathOperation mathOperation = new MathOperation();

        System.out.println("Sum of 2 integers: " + mathOperation.add(5, 3)); // Calls add(int, int)
        System.out.println("Sum of 3 integers: " + mathOperation.add(1, 2, 3)); // Calls add(int, int, int)
        System.out.println("Sum of 2 doubles: " + mathOperation.add(2.5, 3.5)); // Calls add(double, double)
    }
}
