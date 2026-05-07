import java.util.*;

public class CompareTwoCollections {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("A", "B", "C");
        List<String> list3 = Arrays.asList("X", "Y", "Z");

        System.out.println("List 1 equals List 2: " + list1.equals(list2));
        System.out.println("List 1 equals List 3: " + list1.equals(list3));
    }
}