import java.util.Scanner;
import java.io.IOException;

public class ThrowsKeywordDemo {

    static void validateInput(int value) throws IOException {
        if (value < 0) {
            throw new IOException("Negative values are not allowed in this system.");
        } else {
            System.out.println("Input " + value + " is valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        
        try {
            int input = scanner.nextInt();
            validateInput(input);
        } catch (IOException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: Invalid input type.");
        } finally {
            scanner.close();
        }
    }
}