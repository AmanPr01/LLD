package AdvanceLanguageModule.ExceptionHandlingAndMemoryManagement.ExceptionHandling.Throw;

public class ThrowExample {
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above");
        }
        else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);  // Throw custom exception
        }
        catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
