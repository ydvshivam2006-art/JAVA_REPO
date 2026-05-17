import java.util.Scanner;
import java.util.StringTokenizer;

public class NoSuchElementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter space-separated words: ");
            String input = scanner.nextLine();
            
            StringTokenizer tokens = new StringTokenizer(input);

            System.out.println("Token 1: " + tokens.nextToken());
            System.out.println("Token 2: " + tokens.nextToken());
            System.out.println("Token 3: " + tokens.nextToken());

        } catch (java.util.NoSuchElementException e) {
            System.err.println("Error: Attempted to read a token that does not exist.");
            System.err.println("Details: " + e.toString());
        } finally {
            scanner.close();
        }
    }
}