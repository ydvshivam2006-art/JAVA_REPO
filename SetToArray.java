import java.util.*;

public class SetToArray {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("One", "Two", "Three"));
        String[] arr = set.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}