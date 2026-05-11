import java.util.*;

public class ListToArray {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        String[] array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}