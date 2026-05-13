import java.util.*;

public class StringCore {
    public static void main(String[] args) {
        String input = "HelloWorld";
        
        System.out.println(input.substring(5));
        
        System.out.println(input.indexOf('W'));
        
        String s1 = "java";
        String s2 = "java";
        System.out.println(s1 == s2);
        
        String concat = String.join("-", "2026", "05", "14");
        System.out.println(concat);
        
        String padded = "  data  ";
        System.out.println(padded.trim().length());
        
        for (String part : "apple,banana,cherry".split(",")) {
            System.out.println(part);
        }
        
        System.out.println(input.startsWith("Hello"));
    }
}