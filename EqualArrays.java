import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 6};

        boolean result1 = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);

        System.out.println("Are arr1 and arr2 equal? " + result1);
        System.out.println("Are arr1 and arr3 equal? " + result2);
    }
}