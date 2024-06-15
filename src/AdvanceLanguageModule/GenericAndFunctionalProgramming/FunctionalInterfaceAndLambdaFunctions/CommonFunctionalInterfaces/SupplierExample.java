package AdvanceLanguageModule.GenericAndFunctionalProgramming.FunctionalInterfaceAndLambdaFunctions.CommonFunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, Supplier!";

        System.out.println("Supplier gives: " + supplier.get());
    }
}
