import java.util.Scanner;

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();
            calculate(divisor);
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        } finally {
            scanner.close();
        }
    }

    static void calculate(int d) throws Exception {
        try {
            int result = 100 / d;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            Exception newExc = new Exception("Calculation Error occurred");
            newExc.initCause(e);
            throw newExc;
        }
    }
}