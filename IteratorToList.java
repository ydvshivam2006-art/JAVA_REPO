import java.util.*;

public class IteratorToList {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("Red", "Green", "Blue");
        Iterator<String> it = src.iterator();
        List<String> list = new ArrayList<>();
        it.forEachRemaining(list::add);
        System.out.println(list);
    }
}