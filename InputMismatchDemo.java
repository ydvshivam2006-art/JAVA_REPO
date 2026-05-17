import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your numerical age: ");
            int age = scanner.nextInt();

            System.out.println("System verified. Age registered: " + age);

        } catch (InputMismatchException e) {
            System.err.println("\nExecution Error: Input data type does not match expected integer format.");
            System.err.println("Details: " + e.toString());
        } finally {
            scanner.close();
        }
    }
}