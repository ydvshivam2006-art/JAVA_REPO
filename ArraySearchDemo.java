import java.util.Scanner;

public class ArraySearchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] frameworkList = {"Spring", "Hibernate", "Struts", "Play", "Grails"};

        try {
            System.out.println("Available elements in system: " + frameworkList.length);
            System.out.print("Enter index position to fetch metadata: ");
            int placementIndex = scanner.nextInt();

            String framework = frameworkList[placementIndex];
            System.out.println("Payload extracted from position " + placementIndex + ": " + framework);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Execution halted: Requested position does not exist in allocation matrix.");
            System.err.println("System details: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Execution failed due to unrecognized input pattern.");
        } finally {
            scanner.close();
        }
    }
}