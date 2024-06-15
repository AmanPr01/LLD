package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.LambdaFunctions;

import java.util.function.Consumer;

public class LambdaExample {

    // Method accepting a functional interface as argument
    public static void greet(Runnable runnable) {
        runnable.run();
    }

    public static void main(String[] args) {
        // Lambda expression as argument to a method
        greet(() -> System.out.println("Hello, Lambda!"));

        // Lambda expression with parameters
        Consumer<String> print = message -> System.out.println(message);
        print.accept("Lambda expressions are concise!");
    }
}
