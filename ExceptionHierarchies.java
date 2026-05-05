public class ExceptionHierarchies {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Superclass: " + e.getClass().getSuperclass().getName());
        }
    }
}