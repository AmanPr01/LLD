package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.CommonFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 5 even? " + isEven.test(5));
    }
}
