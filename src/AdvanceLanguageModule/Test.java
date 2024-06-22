package AdvanceLanguageModule;

public class Test {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");
        System.out.println(builder.toString());

        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println(buffer.toString());
    }
}
