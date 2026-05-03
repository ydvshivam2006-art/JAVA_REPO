import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveRepeatedElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B", "D"));
        List<String> uniqueList = new ArrayList<>();

        for (String element : list) {
            if (Collections.frequency(list, element) == 1) {
                uniqueList.add(element);
            }
        }
        
        System.out.println(uniqueList);
    }
}