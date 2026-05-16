import java.util.Scanner;

public class NullPointerHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text (or type 'null' to simulate an empty object): ");
        String input = scanner.nextLine();

        String processingString = input.equalsIgnoreCase("null") ? null : input;

        try {
            int length = processingString.length();
            System.out.println("The length of the text is: " + length);
            
            boolean isEqual = processingString.equals("java");
            System.out.println("Matches 'java'? " + isEqual);
        } catch (NullPointerException e) {
            System.err.println("Error: Attempted to perform an operation on a null object reference.");
        } finally {
            scanner.close();
        }
    }
}