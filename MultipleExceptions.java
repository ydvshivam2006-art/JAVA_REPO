public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: Division by zero");
        } catch (Exception e) {
            System.out.println("General Exception caught");
        }
    }
}