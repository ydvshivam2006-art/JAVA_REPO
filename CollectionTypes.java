import java.util.*;

public class CollectionTypes {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        list.add("Item 1");
        set.add("Item 2");
        queue.add("Item 3");

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Queue: " + queue);
    }
}