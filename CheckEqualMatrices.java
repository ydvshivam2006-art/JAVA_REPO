import java.util.Arrays;

public class CheckEqualMatrices {
    public static void main(String[] args) {
        int[][] matrixA = { {1, 2}, {3, 4} };
        int[][] matrixB = { {1, 2}, {3, 4} };
        int[][] matrixC = { {5, 6}, {7, 8} };

        System.out.println("Matrix A and B are equal: " + areEqual(matrixA, matrixB));
        System.out.println("Matrix A and C are equal: " + areEqual(matrixA, matrixC));
    }

    public static boolean areEqual(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!Arrays.equals(a[i], b[i])) {
                return false;
            }
        }
        return true;
    }
}