package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.CommonFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = message -> System.out.println(message);

        printer.accept("Hello, Consumer!");
        printer.accept("Java is fun!");
    }
}
