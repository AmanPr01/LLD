package AdvanceLanguageModule.GenericAndFunctionalProgramming.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamSumExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of all even numbers
        int sum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("Sum of even numbers: " + sum);
    }
}
