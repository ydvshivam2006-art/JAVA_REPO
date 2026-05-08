public class StringToObject {
    public static void main(String[] args) {
        String str = "Hello World";
        Object obj = (Object) str;
        System.out.println("Object class: " + obj.getClass().getName());
        System.out.println("Object value: " + obj);
    }
}