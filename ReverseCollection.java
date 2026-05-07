import java.util.*;

public class ReverseCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("First", "Second", "Third"));
        Collections.reverse(list);
        
        System.out.println("Reversed List: " + list);
    }
}