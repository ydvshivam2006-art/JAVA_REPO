import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToCommaString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "Blue");
        String result = String.join(", ", list);
        
        System.out.println(result);
    }
}