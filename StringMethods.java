import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
        
        String zeroStr = "0000123456";
        String removedZeros = "";
        int i = 0;
        while (i < zeroStr.length() && zeroStr.charAt(i) == '0') {
            i++;
        }
        removedZeros = zeroStr.substring(i);
        System.out.println("Removed Zeros: " + removedZeros);

        String text = "Learn Java and improve your logic";
        System.out.println("Even length words:");
        for (String word : text.split(" ")) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }

        String splitStr = "Programming";
        int n = 3;
        int size = splitStr.length() / n;
        System.out.println("Split into " + n + " parts:");
        for (int j = 0; j < splitStr.length(); j += size) {
            if (j + size <= splitStr.length()) {
                System.out.println(splitStr.substring(j, j + size));
            }
        }

        String s1 = "Java";
        String s2 = "java";
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
    }
}