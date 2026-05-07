import java.util.*;

public class CompareElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 15);
        int min = Collections.min(list);
        int max = Collections.max(list);
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}