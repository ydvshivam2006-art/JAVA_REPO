import java.util.*;

public class VectorToList {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList("X", "Y", "Z"));
        List<String> list = Collections.list(v.elements());
        System.out.println(list);
    }
}