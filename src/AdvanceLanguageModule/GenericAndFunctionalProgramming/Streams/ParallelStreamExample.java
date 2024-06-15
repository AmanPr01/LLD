package AdvanceLanguageModule.GenericAndFunctionalProgramming.Streams;

import java.util.Arrays;

public class ParallelStreamExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Perform operation on parallel stream
        Arrays.stream(array)
                .parallel()
                .map(num -> num * 2)
                .forEachOrdered(System.out::println);
    }
}
