import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ReadZipFile {
    public static void main(String[] args) {
        Map<String, String> env = new HashMap<>();
        try (FileSystem fs = FileSystems.newFileSystem(URI.create("jar:" + Paths.get("archive.zip").toUri()), env)) {
            Path root = fs.getPath("/");
            Files.walk(root).forEach(path -> {
                if (Files.isRegularFile(path)) {
                    System.out.println("File in zip: " + path);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}