import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;
        int digits = 0;
        int temp = number;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        temp = number;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is NOT an Armstrong number");
        }
    }
}