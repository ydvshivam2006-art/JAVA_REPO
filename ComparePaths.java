import java.nio.file.Path;
import java.nio.file.Paths;

public class ComparePaths {
    public static void main(String[] args) {
        Path path1 = Paths.get("file1.txt");
        Path path2 = Paths.get("file2.txt");

        boolean isEqual = path1.equals(path2);
        System.out.println("Are the file paths equal? " + isEqual);
    }
}