package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.CommonFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = num -> num * num;

        System.out.println("Square of 5: " + square.apply(5));
        System.out.println("Square of -3: " + square.apply(-3));
    }
}
