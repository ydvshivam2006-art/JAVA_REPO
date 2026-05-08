import java.util.*;

public class LinkedListToArray {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        String[] arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}