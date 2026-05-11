public class MethodTypes {
    public static void staticMethod() {
        System.out.println("Static method called without object.");
    }

    public void nonStaticMethod() {
        System.out.println("Non-static method called using object.");
    }

    public static void main(String[] args) {
        staticMethod();
        MethodTypes obj = new MethodTypes();
        obj.nonStaticMethod();
    }
}