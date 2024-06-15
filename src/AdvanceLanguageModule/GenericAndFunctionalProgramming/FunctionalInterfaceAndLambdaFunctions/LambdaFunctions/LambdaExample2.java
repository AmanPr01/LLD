package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.LambdaFunctions;

import java.util.Arrays;
import java.util.List;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Scaler", "Academy");

        // Using lambda expression to print each name
        names.forEach(name -> System.out.println(name));
    }
}
