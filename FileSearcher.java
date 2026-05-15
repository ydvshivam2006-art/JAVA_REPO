import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path to search in: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter file name to search for: ");
        String fileNameToFind = scanner.nextLine();

        try (Stream<Path> walk = Files.walk(Paths.get(directoryPath))) {
            boolean found = walk
                    .filter(Files::isRegularFile)
                    .anyMatch(path -> path.getFileName().toString().equalsIgnoreCase(fileNameToFind));

            if (found) {
                System.out.println("File found in the directory structure.");
            } else {
                System.out.println("File not found.");
            }
        } catch (IOException e) {
            System.err.println("Error accessing path: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}