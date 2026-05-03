import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(42);
        numbers.add(8);
        numbers.add(23);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}