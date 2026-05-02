public class AddMatrices {
    public static void main(String[] args) {
        int[][] firstMatrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] secondMatrix = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        int rows = firstMatrix.length;
        int cols = firstMatrix[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}