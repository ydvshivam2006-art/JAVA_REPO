import java.util.Scanner;

public class NumberFormatHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to square: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            int square = number * number;
            System.out.println("The square of " + number + " is: " + square);
        } catch (NumberFormatException e) {
            System.err.println("Invalid Input: '" + input + "' is not a valid integer.");
        } finally {
            scanner.close();
        }
    }
}