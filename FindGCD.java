public class FindGCD {
    public static void main(String[] args) {
        int a = 12, b = 18;
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        System.out.println("GCD: " + a);
    }
}