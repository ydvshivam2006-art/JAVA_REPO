import java.util.Arrays;

public class StringUtility {
    public static void main(String[] args) {
        
        // 1. Get a Character From the Given String
        String str = "Gemini AI";
        char ch = str.charAt(7); 
        System.out.println("Character at index 7: " + ch);

        // 2. Sort a String
        String unsorted = "software";
        char[] charArray = unsorted.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);
        System.out.println("Sorted String: " + sorted);

        // 3. Compare two strings lexicographically
        String s1 = "Mango";
        String s2 = "Apple";
        int comparison = s1.compareTo(s2);
        System.out.println("Lexicographical comparison: " + comparison);

        // 4. Determine the Unicode Code Point at a given index
        String unicodeStr = "Java";
        int codePoint = unicodeStr.codePointAt(0);
        System.out.println("Unicode at index 0: " + codePoint);
    }
}