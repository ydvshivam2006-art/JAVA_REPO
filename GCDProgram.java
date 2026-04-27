import java.util.Scanner;

public class GCDProgram {

    // Method to compute GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        // Handle negative numbers by converting to positive
        a = Math.abs(a);
        b = Math.abs(b);

        // If both are zero, GCD is undefined (return 0 here)
        if (a == 0 && b == 0) {
            return 0;
        }

        // Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // GCD is always positive
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();

            int result = gcd(num1, num2);

            if (result == 0 && num1 == 0 && num2 == 0) {
                System.out.println("GCD is undefined for both numbers being zero.");
            } else {
                System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
