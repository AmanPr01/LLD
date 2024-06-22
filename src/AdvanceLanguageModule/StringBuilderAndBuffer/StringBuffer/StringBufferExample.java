package AdvanceLanguageModule.StringBuilderAndBuffer.StringBuffer;

public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string to the StringBuffer
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        // Insert a string at a specified position
        sb.insert(6, "Java ");
        System.out.println(sb); // Output: Hello Java World

        // Replace a portion of the string with another string
        sb.replace(6, 10, "C++");
        System.out.println(sb); // Output: Hello C++ World

        // Delete a portion of the string
        sb.delete(6, 10);
        System.out.println(sb); // Output: Hello World

        // Reverse the string
        sb.reverse();
        System.out.println(sb); // Output: dlroW olleH

        // Convert StringBuffer to String
        String result = sb.toString();
        System.out.println(result); // Output: dlroW olleH

    }
}
