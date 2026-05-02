import java.util.Arrays;

public class Sort2DArrayColumns {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 5, 1},
            {8, 4, 2},
            {7, 6, 3}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            int[] column = new int[rows];
            for (int i = 0; i < rows; i++) {
                column[i] = matrix[i][j];
            }
            
            Arrays.sort(column);
            
            for (int i = 0; i < rows; i++) {
                matrix[i][j] = column[i];
            }
        }

        System.out.println("Matrix sorted across columns:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}