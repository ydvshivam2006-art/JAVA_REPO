import java.util.*;

public class RotateElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.rotate(list, 2);
        
        System.out.println("Rotated List: " + list);
    }
}