import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        appendToFile("test.txt", "New Content");
        copyFile("test.txt", "copy.txt");
        readZipFile("example.zip");
    }

    public static void appendToFile(String path, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        writer.write(text);
        writer.close();
    }

    public static void copyFile(String source, String dest) throws IOException {
        Files.copy(Paths.get(source), Paths.get(dest), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void readZipFile(String zipPath) throws IOException {
        ZipFile zipFile = new ZipFile(zipPath);
        zipFile.stream().forEach(entry -> System.out.println(entry.getName()));
        zipFile.close();
    }
}