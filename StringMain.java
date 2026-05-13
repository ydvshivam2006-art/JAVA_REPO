import java.util.Stack;

public class StringMain {
    public static void main(String[] args) {
        
        String sample = "Hello";
        char ch = sample.charAt(1);
        System.out.println("Character at index 1: " + ch);

        String stackInput = "VSCode";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < stackInput.length(); i++) {
            stack.push(stackInput.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        System.out.println("Reversed using Stack: " + reversed);

        String s1 = "Apple";
        String s2 = "Banana";
        int comparison = s1.compareTo(s2);
        if (comparison < 0) {
            System.out.println(s1 + " comes before " + s2 + " lexicographically");
        } else if (comparison > 0) {
            System.out.println(s1 + " comes after " + s2 + " lexicographically");
        } else {
            System.out.println("Strings are equal");
        }

        String email = "user@example.com";
        String[] parts = email.split("@");
        System.out.println("Username: " + parts[0]);
        System.out.println("Domain: " + parts[1]);
    }
}