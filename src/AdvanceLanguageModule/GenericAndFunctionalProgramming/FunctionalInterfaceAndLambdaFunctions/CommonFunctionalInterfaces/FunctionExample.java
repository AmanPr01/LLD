package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.CommonFunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> strLength = str -> str.length();

        System.out.println("Length of 'Hello': " + strLength.apply("Hello"));
        System.out.println("Length of 'Java Functional': " + strLength.apply("Java Functional"));
    }
}
