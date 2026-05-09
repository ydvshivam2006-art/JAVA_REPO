public class FindLCM {
    public static void main(String[] args) {
        int a = 12, b = 18, gcd = 1;
        for (int i = 1; i <= a && i <= b; ++i) {
            if (a % i == 0 && b % i == 0) gcd = i;
        }
        System.out.println("LCM: " + (a * b) / gcd);
    }
}