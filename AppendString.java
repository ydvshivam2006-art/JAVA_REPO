import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendString {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt", true))) {
            writer.write("Appended line of text.\n");
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}