import java.util.*;

public class StringHelper {
    public static void main(String[] args) {
        String original = "GeeksGeeks";
        String toInsert = "For";
        int index = 4;

        String result = original.substring(0, index + 1) + toInsert + original.substring(index + 1);
        System.out.println("Modified String: " + result);

        String text = "HelloWorld";
        int n = 2;
        int len = text.length();
        int temp = 0, chars = len / n;
        String[] equalStr = new String[n];
        for (int i = 0; i < len; i = i + chars) {
            String part = text.substring(i, i + chars);
            equalStr[temp] = part;
            temp++;
        }
        System.out.println("Substrings: " + Arrays.toString(equalStr));

        String swapMe = "Java";
        char[] ch = swapMe.toCharArray();
        for (int i = 0; i < ch.length - 1; i += 2) {
            char tempChar = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = tempChar;
        }
        System.out.println("Swapped Pairs: " + new String(ch));

        String s1 = "Apple";
        String s2 = "Banana";
        System.out.println("Comparison: " + s1.compareTo(s2));

        String unicodeStr = "Java";
        int codePoint = unicodeStr.codePointAt(1);
        System.out.println("Unicode at index 1: " + codePoint);
    }
}