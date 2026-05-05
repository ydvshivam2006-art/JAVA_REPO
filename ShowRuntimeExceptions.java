public class ShowRuntimeExceptions {
    public static void main(String[] args) {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Runtime Exception caught: " + e.getClass().getName());
        }
    }
}