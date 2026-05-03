import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitList {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        
        int midpoint = originalList.size() / 2;
        List<Integer> firstHalf = new ArrayList<>(originalList.subList(0, midpoint));
        List<Integer> secondHalf = new ArrayList<>(originalList.subList(midpoint, originalList.size()));

        System.out.println("First Half: " + firstHalf);
        System.out.println("Second Half: " + secondHalf);
    }
}