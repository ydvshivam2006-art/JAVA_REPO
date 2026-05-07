import java.util.*;

public class ArrayToCollection {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C++"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        
        System.out.println("Collection elements: " + list);
    }
}