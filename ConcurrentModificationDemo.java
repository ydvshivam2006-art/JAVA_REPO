import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        
        List<String> items = new ArrayList<>();
        items.add("Processor");
        items.add("Memory");
        items.add("Storage");

        try {
            System.out.println("Initial inventory list: " + items);

            for (String item : items) {
                System.out.println("Checking item: " + item);
                if (item.equals("Memory")) {
                    items.remove(item);
                }
            }

        } catch (java.util.ConcurrentModificationException e) {
            System.err.println("\nExecution Error: Collection structure altered during iteration loop.");
            System.err.println("Details: " + e.toString());
        }
    }
}