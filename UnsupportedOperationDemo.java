import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationDemo {
    public static void main(String[] args) {
        
        List<String> frameworkList = Arrays.asList("Spring", "Hibernate", "Struts");

        try {
            System.out.println("Current active elements: " + frameworkList);
            
            System.out.println("Attempting to modify the fixed-size structure...");
            frameworkList.add("Play");
            
        } catch (UnsupportedOperationException e) {
            System.err.println("Execution Error: Modification operations are prohibited.");
            System.err.println("System details: " + e.getClass().getName());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}