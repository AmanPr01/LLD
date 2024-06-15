package AdvanceLanguageModule.ExceptionHandlingAndMemoryManagement.ExceptionHandling.Throws;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExample {
    public static void readFile(String filename) throws FileNotFoundException, IOException {
        throw new FileNotFoundException("file.txt not found");
    }

    public static void main(String[] args) {
        try {
            readFile("file.txt"); // Method may throw FileNotFoundException or IOException
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
