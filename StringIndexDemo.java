import java.util.Scanner;

public class StringIndexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String message = scanner.nextLine();

        try {
            System.out.println("Word length: " + message.length());
            
            System.out.print("Enter an index to look up: ");
            int index = scanner.nextInt();

            char letter = message.charAt(index);
            System.out.println("The character at index " + index + " is: " + letter);

        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Error: The requested index is outside the bounds of the string.");
            System.err.println("Details: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid entry. Please use numbers for the index look up.");
        } finally {
            scanner.close();
        }
    }
}