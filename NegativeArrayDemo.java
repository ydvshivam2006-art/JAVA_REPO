import java.util.Scanner;

public class NegativeArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the buffer allocation size: ");
            int allocationSize = scanner.nextInt();

            int[] dataBuffer = new int[allocationSize];
            System.out.println("Buffer successfully allocated with capacity: " + dataBuffer.length);

        } catch (NegativeArraySizeException e) {
            System.err.println("Execution Error: Memory dimension allocation cannot be negative.");
            System.err.println("Details: " + e.toString());
        } catch (Exception e) {
            System.err.println("Invalid numeric input system format.");
        } finally {
            scanner.close();
        }
    }
}