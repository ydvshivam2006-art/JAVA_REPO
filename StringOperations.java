import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        String s1 = "Alpha";
        String s2 = "Beta";
        System.out.println(s1.equals(s2));

        String mix = "123abc456";
        System.out.println(mix.replaceAll("[0-9]", ""));

        String text = "Program";
        if (text.length() > 0) {
            System.out.println(text.charAt(text.length() - 1));
        }

        String data = "apple;orange;grape";
        String[] fruits = data.split(";");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String check = "Java Developer";
        System.out.println(check.endsWith("Developer"));

        String repeat = "Hi! ";
        System.out.println(repeat.repeat(3));
    }
}