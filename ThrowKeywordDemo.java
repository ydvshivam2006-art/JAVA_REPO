import java.util.Scanner;

public class ThrowKeywordDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = scanner.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            processWithdrawal(balance, amount);
        } catch (IllegalArgumentException e) {
            System.err.println("Transaction Failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: Invalid input format.");
        } finally {
            scanner.close();
        }
    }

    static void processWithdrawal(double balance, double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for this withdrawal.");
        }
        
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }

        double remainingBalance = balance - amount;
        System.out.println("Transaction successful! Remaining balance: " + remainingBalance);
    }
}