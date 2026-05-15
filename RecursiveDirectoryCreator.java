    import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;

public class RecursiveDirectoryCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the full nested path to create (e.g., folder1/folder2/folder3): ");
        String pathInput = scanner.nextLine();
        Path path = Paths.get(pathInput);

        try {
            Files.createDirectories(path);
            System.out.println("Directories created successfully at: " + path.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Failed to create directories: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}