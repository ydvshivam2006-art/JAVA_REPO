import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println(hex);
        sc.close();
    }
}