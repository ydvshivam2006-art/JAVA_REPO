import java.util.Scanner;

class InvalidScoreException extends RuntimeException {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class CustomRuntimeExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter test score (0 - 100): ");
            int score = scanner.nextInt();
            validateScore(score);
        } catch (InvalidScoreException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("System Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }

    static void validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100. Entered: " + score);
        }
        System.out.println("Score of " + score + " registered successfully.");
    }
}