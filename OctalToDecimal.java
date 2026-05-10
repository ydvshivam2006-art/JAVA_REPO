import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octalString = sc.nextLine();
        int decimal = Integer.parseInt(octalString, 8);
        System.out.println(decimal);
        sc.close();
    }
}