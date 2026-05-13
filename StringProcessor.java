import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
    public static void main(String[] args) {
        
        String original = "GeeksforGeeks";
        int index = 5;
        char ch = 'F';
        String replaced = original.substring(0, index) + ch + original.substring(index + 1);
        System.out.println("Replaced Character: " + replaced);

        String mainString = "GeeksGeeks";
        String insertString = "For";
        int pos = 4;
        String inserted = mainString.substring(0, pos + 1) + insertString + mainString.substring(pos + 1);
        System.out.println("Inserted String: " + inserted);

        String regexInput = "Java Is Fun";
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m = p.matcher(regexInput);
        System.out.print("First letters: ");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();

        String str1 = "Apple";
        String str2 = "Apple";
        System.out.println("Strings are equal? " + str1.equals(str2));
    }
}