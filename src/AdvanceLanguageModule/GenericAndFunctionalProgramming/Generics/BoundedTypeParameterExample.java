package AdvanceLanguageModule.GenericAndFunctionalProgramming.Generics;

public class BoundedTypeParameterExample {
    public static <T extends Number> void printDoubleValue(T value) {
        System.out.println(value.doubleValue());
    }

    public static void main(String[] args) {
        printDoubleValue(10);    // Integer
        printDoubleValue(10.5);  // Double
    }
}
