public class InterchangeRows {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int first = 0;
        int last = matrix.length - 1;

        int[] temp = matrix[first];
        matrix[first] = matrix[last];
        matrix[last] = temp;

        System.out.println("Matrix after swapping first and last rows:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}