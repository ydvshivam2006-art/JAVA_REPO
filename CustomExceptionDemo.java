import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age to check eligibility: ");
            int age = scanner.nextInt();
            checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.err.println("Caught Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("General Error: Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }

    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is under 18. Not eligible for registration.");
        } else {
            System.out.println("Eligibility confirmed. Access granted.");
        }
    }
}