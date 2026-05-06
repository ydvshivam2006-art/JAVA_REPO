import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            File file = new File("non_existent_file.txt");
            FileReader reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception caught: " + e.getMessage());
        }
    }
}