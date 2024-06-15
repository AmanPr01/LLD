package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.FunctionalInterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expression to implement MyFunctionalInterface
        MyFunctionalInterface func = () -> System.out.println("Doing something...");
        func.doSomething();

        // Accessing default method
        func.doSomethingElse();
    }
}
