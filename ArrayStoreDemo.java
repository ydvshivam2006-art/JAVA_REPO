public class ArrayStoreDemo {
    public static void main(String[] args) {
        
        Number[] numbers = new Integer[3];

        try {
            numbers[0] = 10; 
            System.out.println("Stored first position: " + numbers[0]);

            System.out.println("Attempting to store an incompatible type...");
            numbers[1] = 45.67; 

        } catch (ArrayStoreException e) {
            System.err.println("Execution Error: Data type mismatch during array storage.");
            System.err.println("Details: " + e.toString());
        }
    }
}