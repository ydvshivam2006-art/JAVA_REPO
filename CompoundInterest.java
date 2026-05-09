public class CompoundInterest {
    public static void main(String[] args) {
        double p = 1000, r = 5, t = 2;
        double amount = p * Math.pow((1 + r / 100), t);
        System.out.println("CI: " + (amount - p));
    }
}