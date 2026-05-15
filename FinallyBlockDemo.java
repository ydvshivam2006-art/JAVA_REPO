import java.util.Scanner;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 100 by: ");
            String input = scanner.nextLine();
            int divisor = Integer.parseInt(input);
            
            int result = 100 / divisor;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric integer.");
        } finally {
            System.out.println("Finally block executed: Cleaning up resources...");
            scanner.close();
            System.out.println("Scanner closed successfully.");
        }
    }
}