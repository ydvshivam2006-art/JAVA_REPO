import java.io.*;
import java.util.stream.Collectors;

public class InputStreamToString {
    public static void main(String[] args) throws IOException {
        InputStream is = new ByteArrayInputStream("Hello Stream".getBytes());
        String result = new BufferedReader(new InputStreamReader(is))
                        .lines().collect(Collectors.joining("\n"));
        System.out.println(result);
    }
}