public class FindDeterminant {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        int determinant = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        System.out.println("Determinant: " + determinant);
    }
}