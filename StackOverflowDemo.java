public class StackOverflowDemo {

    public static void main(String[] args) {
        StackOverflowDemo demo = new StackOverflowDemo();
        
        try {
            demo.recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.err.println("Execution stopped!");
            System.err.println("Error encountered: " + e.toString());
        }
    }

    public void recursiveMethod(int counter) {
        System.out.println("Method call depth: " + counter);
        recursiveMethod(counter + 1);
    }
}