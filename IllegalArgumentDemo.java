import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a percentage value (0 to 100): ");
            int inputPercentage = scanner.nextInt();

            setProgressBar(inputPercentage);
        } catch (IllegalArgumentException e) {
            System.err.println("Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid input type. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    static void setProgressBar(int percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100 inclusive.");
        }
        System.out.println("Progress bar successfully updated to: " + percentage + "%");
    }
}