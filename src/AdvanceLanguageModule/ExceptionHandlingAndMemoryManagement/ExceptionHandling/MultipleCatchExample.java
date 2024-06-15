package AdvanceLanguageModule.ExceptionHandlingAndMemoryManagement.ExceptionHandling;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        }
    }
}
