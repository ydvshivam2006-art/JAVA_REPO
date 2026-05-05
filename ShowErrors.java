public class ShowErrors {
    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Error caught: " + e.getClass().getName());
        }
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}