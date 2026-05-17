public class FormatConversionDemo {
    public static void main(String[] args) {
        String profileName = "Admin";
        int accessLevel = 5;

        try {
            System.out.printf("User: %s | Access Level: %d\n", profileName, accessLevel);

            System.out.println("Attempting invalid conversion character...");
            System.out.printf("System status check: %z \n", profileName);

        } catch (java.util.UnknownFormatConversionException e) {
            System.err.println("\nExecution Error: Invalid conversion modifier code detected.");
            System.err.println("Details: " + e.toString());
        }
    }
}