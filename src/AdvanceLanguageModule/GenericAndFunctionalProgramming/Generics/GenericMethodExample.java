package AdvanceLanguageModule.GenericAndFunctionalProgramming.Generics;

public class GenericMethodExample {
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};

        System.out.println("Integer Array: ");
        printArray(intArray);

        System.out.println("String Array: ");
        printArray(stringArray);
    }
}
