package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.CommonFunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;

        System.out.println("Sum of 10 and 5: " + sum.apply(10, 5));
        System.out.println("Sum of -3 and 7: " + sum.apply(-3, 7));
    }
}
