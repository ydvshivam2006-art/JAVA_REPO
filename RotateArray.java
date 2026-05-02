public class RotateArray {
    public static void rotateLeft(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
    }
}