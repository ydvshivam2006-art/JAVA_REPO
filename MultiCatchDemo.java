import java.util.Scanner;

public class MultiCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String input1 = scanner.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.print("Enter second number: ");
            String input2 = scanner.nextLine();
            int num2 = Integer.parseInt(input2);

            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException | NumberFormatException e) {
            System.err.println("Error handled in multi-catch: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}