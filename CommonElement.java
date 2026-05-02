import java.util.HashSet;

public class CommonElements {
    public static void findCommon(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : a) {
            set.add(val);
        }
        for (int val : b) {
            if (set.contains(val)) {
                System.out.print(val + " ");
            }
        }
    }
}