import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNull {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", null, "Python", null, "C++"));
        list.removeAll(Arrays.asList((String) null));
        
        System.out.println(list);
    }
}