import java.util.Arrays;

public class CopyArray {
    public static void copy() {
        int[] original = {1, 2, 3};
        int[] copied = Arrays.copyOf(original, original.length);
    }
}