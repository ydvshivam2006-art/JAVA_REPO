public class NormalAndTrace {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        double sumSquares = 0;
        int trace = 0;

        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
            for (int j = 0; j < matrix[i].length; j++) {
                sumSquares += (matrix[i][j] * matrix[i][j]);
            }
        }

        double normal = Math.sqrt(sumSquares);
        System.out.println("Normal: " + normal);
        System.out.println("Trace: " + trace);
    }
}