import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class DirectoryTraverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path to traverse: ");
        String pathInput = scanner.nextLine();
        Path startPath = Paths.get(pathInput);

        if (!Files.exists(startPath) || !Files.isDirectory(startPath)) {
            System.out.println("The path provided is not a valid directory.");
            scanner.close();
            return;
        }

        try (Stream<Path> stream = Files.walk(startPath)) {
            stream.forEach(path -> {
                String type = Files.isDirectory(path) ? "[DIR ] " : "[FILE] ";
                System.out.println(type + path.getFileName());
            });
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}