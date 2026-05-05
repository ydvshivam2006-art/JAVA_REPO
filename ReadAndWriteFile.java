import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        Path source = Paths.get("source.txt");
        Path target = Paths.get("target_copy.txt");
        
        try {
            String content = Files.readString(source);
            Files.writeString(target, content);
            System.out.println("Content read and written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}