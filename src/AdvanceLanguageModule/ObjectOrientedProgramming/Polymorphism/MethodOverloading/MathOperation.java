package AdvanceLanguageModule.ObjectOrientedProgramming.Polymorphism.MethodOverloading;

// Method Overloading
// Compile-time Polymorphism

public class MathOperation {

    // Add 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Add 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add 2 double values
    double add(double a, double b) {
        return a + b;
    }
}
