package AdvanceLanguageModule.GenericAndFunctionalProgramming.Generics;

// Generic class Example
public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println("Box contains: " + integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("Box contains: " + stringBox.get());
    }
}
