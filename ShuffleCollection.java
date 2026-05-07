import java.util.*;

public class ShuffleCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");
        Collections.shuffle(list);
        
        System.out.println("Shuffled List: " + list);
    }
}