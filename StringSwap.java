import java.util.*;

public class StringSwap {
    public static void main(String[] args) {
        
        // 1. Swapping Pair of Characters
        String input = "ABCDEFGH";
        char[] chArr = input.toCharArray();
        for (int i = 0; i < chArr.length - 1; i += 2) {
            char temp = chArr[i];
            chArr[i] = chArr[i + 1];
            chArr[i + 1] = temp;
        }
        System.out.println("After Swapping Pairs: " + new String(chArr));

        // 2. Compare two strings lexicographically
        String s1 = "Geeks";
        String s2 = "Greeks";
        int comparison = s1.compareTo(s2);
        System.out.println("Lexicographical Comparison: " + comparison);

        // 3. Get a Character From the Given String
        String text = "Learning Java";
        char resultChar = text.charAt(9);
        System.out.println("Character at index 9: " + resultChar);

        // 4. Print even length words
        String sentence = "Be kind to everyone today";
        System.out.println("Even length words:");
        for (String word : sentence.split(" ")) {
            if (word.length() % 2 == 0) {
                System.out.println("- " + word);
            }
        }
    }
}