import java.util.Scanner;

public class InchesToMetres {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter inches
        System.out.print("Enter length in inches: ");
        double inches = sc.nextDouble();

        // Conversion formula
        double metres = inches * 0.0254;

        // Display result
        System.out.println("Length in metres: " + metres);

        // Close scanner
        sc.close();
    }
}