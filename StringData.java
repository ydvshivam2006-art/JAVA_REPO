import java.util.Arrays;

public class StringData {
    public static void main(String[] args) {
        
        String swapStr = "ABCDEF";
        char[] chars = swapStr.toCharArray();
        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }
        System.out.println("Swapped Pairs: " + new String(chars));

        String sortStr = "programming";
        char[] sortArray = sortStr.toCharArray();
        Arrays.sort(sortArray);
        System.out.println("Sorted String: " + new String(sortArray));

        String uniStr = "Java";
        int index = 2;
        int unicode = uniStr.codePointAt(index);
        System.out.println("Unicode at index " + index + ": " + unicode);

        String s1 = "Hello";
        String s2 = "hello";
        System.out.println("Strict Comparison (s1 == s2): " + s1.equals(s2));
    }
}