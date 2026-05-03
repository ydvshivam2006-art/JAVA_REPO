import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLastElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta"));
        
        String first = list.get(0);
        String last = list.get(list.size() - 1);

        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);
    }
}