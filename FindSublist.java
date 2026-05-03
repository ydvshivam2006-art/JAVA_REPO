import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSublist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        List<String> sublist = Arrays.asList("B", "C");
        
        int index = -1;
        for (int i = 0; i <= list.size() - sublist.size(); i++) {
            if (list.subList(i, i + sublist.size()).equals(sublist)) {
                index = i;
                break;
            }
        }
        System.out.println("Sublist found at index: " + index);
    }
}