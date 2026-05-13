import java.util.*;

public class StringUtil {
    public static void main(String[] args) {
        String input = "Learning Java";
        
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
        
        System.out.println(input.startsWith("Learn"));
        System.out.println(input.endsWith("Java"));
        
        String replaced = input.replace("Java", "Coding");
        System.out.println(replaced);
        
        char[] chars = input.toCharArray();
        for (char c : chars) {
            System.out.print(c + "|");
        }
        System.out.println();
        
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.equalsIgnoreCase(s2));
        
        String joined = String.join(" - ", "Apple", "Banana", "Cherry");
        System.out.println(joined);
    }
}