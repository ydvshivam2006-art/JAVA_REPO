import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class PatternMatcher {
    public static void main(String[] args) {
        String regex = "\\d+"; // Example pattern to match numbers
        Pattern pattern = Pattern.compile(regex);

        try (Stream<String> lines = Files.lines(Paths.get("sample.txt"))) {
            lines.forEach(line -> {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println("Match found: " + matcher.group());
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}