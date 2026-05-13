import java.util.Scanner;

public class StringFinal {
    public static void main(String[] args) {
        String input = "JavaProgramming";
        
        System.out.println("Length: " + input.length());
        
        System.out.println("Substring: " + input.substring(0, 4));
        
        System.out.println("Lowercase: " + input.toLowerCase());
        
        System.out.println("Uppercase: " + input.toUpperCase());
        
        String word = "  Trim Me  ";
        System.out.println("Trimmed: '" + word.trim() + "'");
        
        String replace = "Hello World";
        System.out.println("Replace: " + replace.replace('o', '0'));
        
        String check = "Banana";
        System.out.println("Contains 'nan': " + check.contains("nan"));
        
        String empty = "";
        System.out.println("Is empty: " + empty.isEmpty());
    }
}