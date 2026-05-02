import java.util.ArrayList;

public class RemoveElement {
    public static int[] removeAll(int[] arr, int key) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : arr) {
            if (val != key) {
                list.add(val);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}