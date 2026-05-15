import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter some text to save to a file: ");
        String content = scanner.nextLine();

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("Success: Data written to output.txt");
        } catch (IOException e) {
            System.err.println("Exception occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}