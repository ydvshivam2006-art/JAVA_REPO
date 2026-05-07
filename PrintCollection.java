import java.util.*;

public class PrintCollection {
    public static void main(String[] args) {
        Collection<String> data = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        
        System.out.println("Direct print: " + data);
        
        data.forEach(item -> System.out.println("Iterator print: " + item));
    }
}