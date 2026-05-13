import java.util.*;

public class StringPrograms {
    public static void main(String[] args) {
        String input = "Hello World";
        String sentence = "The quick brown fox jumps over the lazy dog";

        char ch = input.charAt(6); 
        System.out.println("Character at index 6: " + ch);

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String: " + reversed);

        char[] charArray = input.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        System.out.println("Sorted String: " + new String(charArray));

        System.out.println("Is the sentence a Pangram? " + isPangram(sentence));

        System.out.println("Even length words in 'Java is very cool':");
        printEvenWords("Java is very cool");
        
        String zeroStr = "00012345";
        String noZeros = zeroStr.replaceFirst("^0+(?!$)", "");
        System.out.println("String without leading zeros: " + noZeros);
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabetPresent = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!alphabetPresent[index]) {
                    alphabetPresent[index] = true;
                    count++;
                }
            }
        }
        return count == 26;
    }

    public static void printEvenWords(String s) {
        for (String word : s.split("\\s+")) {
            if (word.length() % 2 == 0) {
                System.out.println("- " + word);
            }
        }
    }
}