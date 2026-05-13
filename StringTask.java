import java.util.Arrays;

public class StringTask {
    public static void main(String[] args) {
        String str = "java";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println("Sorted: " + new String(chars));

        String uniText = "Code";
        System.out.println("Unicode at index 1: " + uniText.codePointAt(1));

        String pairStr = "12345678";
        char[] pairChars = pairStr.toCharArray();
        for (int i = 0; i < pairChars.length - 1; i += 2) {
            char temp = pairChars[i];
            pairChars[i] = pairChars[i + 1];
            pairChars[i + 1] = temp;
        }
        System.out.println("Swapped: " + new String(pairChars));

        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println("Equals: " + s1.equalsIgnoreCase(s2));
    }
}