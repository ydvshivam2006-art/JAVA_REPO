import java.util.*;

public class StringActions {
    public static void main(String[] args) {
        
        // 1. Reverse a String
        String str = "Programming";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);

        // 2. Splitting into a number of sub-strings
        String text = "JavaIsFun";
        int n = 3; // Number of parts
        int len = text.length() / n;
        System.out.println("Split Sub-strings:");
        for (int i = 0; i < text.length(); i += len) {
            System.out.println(text.substring(i, Math.min(i + len, text.length())));
        }

        // 3. Replace a character at a specific index
        String original = "Hello World";
        int index = 4;
        char newChar = 'p';
        String replaced = original.substring(0, index) + newChar + original.substring(index + 1);
        System.out.println("After Replacement: " + replaced);

        // 4. Compare two strings (Case Sensitive)
        String s1 = "JAVA";
        String s2 = "java";
        System.out.println("Are strings exactly equal? " + s1.equals(s2));
    }
}