import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            try {
                int num = Integer.parseInt(input);
                System.out.println("Inner Try: Conversion successful.");

                try {
                    int result = 100 / num;
                    System.out.println("Innermost Try: Division result is " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Innermost Catch: Cannot divide by zero.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Inner Catch: Invalid number format.");
            }

        } catch (Exception e) {
            System.out.println("Outer Catch: A general error occurred.");
        } finally {
            scanner.close();
        }
    }
}