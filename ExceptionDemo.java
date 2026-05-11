public class ExceptionDemo {
    public static void main(String[] args) {
        showRuntimeException();
        showError();
    }

    public static void showRuntimeException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Runtime Exception caught: " + e);
        }
    }

    public static void showError() {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Error caught: Stack Overflow");
        }
    }

    private static void recursiveMethod() {
        recursiveMethod();
    }
}