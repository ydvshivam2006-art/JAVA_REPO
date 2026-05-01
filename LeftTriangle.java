class LeftTriangle{
    public static void printLeftTriangle(int n) {
        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printLeftTriangle(n);
    }
}