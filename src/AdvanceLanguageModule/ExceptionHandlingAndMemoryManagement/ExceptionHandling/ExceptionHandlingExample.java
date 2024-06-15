package AdvanceLanguageModule.ExceptionHandlingAndMemoryManagement.ExceptionHandling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException: division by zero
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
