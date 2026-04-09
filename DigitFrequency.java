import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter digit to find frequency: ");
        int digit = sc.nextInt();

        int count = 0;

        while (number > 0) {
            int remainder = number % 10; 

            if (remainder == digit) {
                count++;
            }

            number = number / 10; 
        }

        System.out.println("Frequency of digit = " + count);
    }
}