import java.util.*;

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        String[] array = list.toArray(new String[0]);
        
        System.out.println("Array elements: " + Arrays.toString(array));
    }
}