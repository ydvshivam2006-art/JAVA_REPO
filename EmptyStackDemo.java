import java.util.Stack;

public class EmptyStackDemo {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        try {
            history.push("Home Page");
            history.push("Dashboard");
            System.out.println("Current Stack: " + history);

            System.out.println("Popping: " + history.pop());
            System.out.println("Popping: " + history.pop());
            
            System.out.println("Attempting to pop from an empty stack...");
            System.out.println("Popping: " + history.pop());

        } catch (java.util.EmptyStackException e) {
            System.err.println("\nExecution Error: Cannot remove elements from an empty structural stack.");
            System.err.println("Details: " + e.toString());
        }
    }
}