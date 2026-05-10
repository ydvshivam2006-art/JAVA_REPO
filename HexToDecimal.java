import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);
        sc.close();
    }
}