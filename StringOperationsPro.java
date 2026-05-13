import java.util.*;

public class StringOperationsPro {
    public static void main(String[] args) {
        
        String pangramInput = "The quick brown fox jumps over the lazy dog";
        System.out.println("Is Pangram: " + checkPangram(pangramInput));

        String leadingZeroStr = "0000012345";
        String result = leadingZeroStr.replaceFirst("^0+(?!$)", "");
        System.out.println("Removed Leading Zeros: " + result);

        String splitMe = "abcdefghijkl";
        int n = 4; 
        int size = splitMe.length() / n;
        System.out.println("Split into " + n + " substrings:");
        for (int i = 0; i < splitMe.length(); i += size) {
            System.out.println(splitMe.substring(i, Math.min(i + size, splitMe.length())));
        }

        String s1 = "Java";
        String s2 = "Java";
        System.out.println("Compare Strings: " + s1.equals(s2));
    }

    public static boolean checkPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabet = new boolean[26];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
        }
        return count == 26;
    }
}