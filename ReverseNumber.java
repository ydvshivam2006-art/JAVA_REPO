import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, reverse = 0, rem;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while(num != 0) {
            rem = num % 10;              // Step 1: get last digit
            reverse = reverse * 10 + rem; // Step 2: build reverse
            num = num / 10;              // Step 3: remove last digit
        }

        System.out.println("Reversed number = " + reverse);
    }
}