import java.util.*;
import java.util.stream.Collectors;

public class StringCharList {
    public static void main(String[] args) {
        String str = "Hello";
        List<Character> chars = str.chars()
                                   .mapToObj(e -> (char) e)
                                   .collect(Collectors.toList());
        System.out.println(chars);
    }
}