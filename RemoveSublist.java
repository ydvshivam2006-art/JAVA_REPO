import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSublist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("X", "Y", "A", "B", "Z"));
        List<String> sublist = Arrays.asList("A", "B");
        
        list.removeAll(sublist);
        System.out.println(list);
    }
}