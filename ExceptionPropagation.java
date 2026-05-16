import java.util.Scanner;

public class ExceptionPropagation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExceptionPropagation demo = new ExceptionPropagation();

        System.out.print("Enter a string to convert to an integer: ");
        String userInput = scanner.nextLine();

        try {
            demo.levelOne(userInput);
        } catch (NumberFormatException e) {
            System.err.println("Main method caught the propagated exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    void levelOne(String input) {
        levelTwo(input);
    }

    void levelTwo(String input) {
        int result = Integer.parseInt(input);
        System.out.println("Parsed result: " + result);
    }
}