import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted: " + new String(arr));
    }
}