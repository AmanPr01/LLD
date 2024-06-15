package AdvanceLanguageModule.ExceptionHandlingAndMemoryManagement.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class FinallyExample {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            // read file contents
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
        finally {
            // close resources in finally block
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch(IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
