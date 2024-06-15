package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.FunctionalInterface;

public interface MyFunctionalInterface {
    void doSomething();  // Single abstract method

    default void doSomethingElse() {
        // Default method
        System.out.println("Do something else.....");
    }
}
