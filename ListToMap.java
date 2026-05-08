import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Map<String, Integer> map = list.stream()
                                       .collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map);
    }
}