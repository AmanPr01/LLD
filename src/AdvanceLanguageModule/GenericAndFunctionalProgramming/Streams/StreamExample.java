package AdvanceLanguageModule.GenericAndFunctionalProgramming.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "ABob", "Charlie", "David", "Emma");

        // Print names starting with 'A' in uppercase
        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
