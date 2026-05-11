import java.util.Arrays;

public class StringConversions {
    public static void main(String[] args) {
        String str = "100";
        
        Object obj = (Object) str;
        System.out.println("Object: " + obj);

        byte[] bytes = str.getBytes();
        System.out.println("Byte Array: " + Arrays.toString(bytes));
        
        byte b = Byte.parseByte(str);
        System.out.println("Byte Value: " + b);
    }
}