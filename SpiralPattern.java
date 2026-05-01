public class SpiralPattern {

    public static void printSpiral(int size) {

        int row = 0, col = 0;
        int b = size - 1;
        int sl = size - 1;
        int f = 1;
        char m = 'r';

        int[][] matrix = new int[size][size];

        for (int i = 1; i <= size * size; i++) {

            matrix[row][col] = i;

            switch (m) {
                case 'r':
                    col++;
                    break;
                case 'd':
                    row++;
                    break;
                case 'l':
                    col--;
                    break;
                case 'u':
                    row--;
                    break;
            }

            if (i == b) {
                b += sl;

                if (f != 2) {
                    f = 2;
                } else {
                    f = 1;
                    sl--;
                }

                switch (m) {
                    case 'r':
                        m = 'd';
                        break;
                    case 'd':
                        m = 'l';
                        break;
                    case 'l':
                        m = 'u';
                        break;
                    case 'u':
                        m = 'r';
                        break;
                }
            }
        }

        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 4;
        printSpiral(size);
    }
}