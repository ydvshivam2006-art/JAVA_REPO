import java.util.Scanner;

class DatabaseException extends Exception {
    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class NestedExceptionsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter database reference index: ");
            String reference = scanner.nextLine();
            
            processQuery(reference);
        } catch (DatabaseException e) {
            System.err.println("Application Alert: " + e.getMessage());
            System.err.println("Root Underlying Cause: " + e.getCause());
        } finally {
            scanner.close();
        }
    }

    static void processQuery(String reference) throws DatabaseException {
        try {
            int index = Integer.parseInt(reference);
            if (index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index cannot be negative.");
            }
            System.out.println("Query executed successfully for record: " + index);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new DatabaseException("Database transaction failed for reference raw data.", e);
        }
    }
}