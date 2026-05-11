import java.util.*;
import java.util.stream.*;

public class CollectionConversions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "Red");

        Stream<String> stream = list.stream();
        
        Set<String> set = list.stream().collect(Collectors.toSet());
        System.out.println("Set: " + set);

        String[] array = set.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));
    }
}