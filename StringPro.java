import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPro {
    public static void main(String[] args) {
        String text = "abcdefghijkl";
        int n = 3;
        int size = text.length() / n;
        for (int i = 0; i < text.length(); i += size) {
            System.out.println(text.substring(i, Math.min(i + size, text.length())));
        }

        String phrase = "The quick brown fox jumps over the lazy dog";
        boolean[] alphabet = new boolean[26];
        int count = 0;
        for (char c : phrase.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' && !alphabet[c - 'a']) {
                alphabet[c - 'a'] = true;
                count++;
            }
        }
        System.out.println("Is Pangram: " + (count == 26));

        String regexStr = "Java Programming Language";
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m = p.matcher(regexStr);
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
    }
}