import java.util.*;

public class ReplaceElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Dog", "Cat", "Bird"));
        list.set(1, "Hamster");
        
        System.out.println("Modified List: " + list);
    }
}