public class FibonacciEvenSum {
    public static void main(String[] args) {
        int n = 100, a = 0, b = 1, sum = 0;
        while (b <= n) {
            if (b % 2 == 0) sum += b;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Even Sum: " + sum);
    }
}