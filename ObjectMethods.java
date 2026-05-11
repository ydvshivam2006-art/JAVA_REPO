public class ObjectMethods {
    private String name;

    public ObjectMethods(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Object name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ObjectMethods other = (ObjectMethods) obj;
        return name.equals(other.name);
    }

    public static void main(String[] args) {
        ObjectMethods obj1 = new ObjectMethods("Java");
        ObjectMethods obj2 = new ObjectMethods("Java");
        System.out.println(obj1.toString());
        System.out.println("Are they equal? " + obj1.equals(obj2));
    }
}