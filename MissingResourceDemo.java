import java.util.Locale;
import java.util.ResourceBundle;

public class MissingResourceDemo {
    public static void main(String[] args) {
        
        try {
            System.out.println("Configuring localization context...");
            ResourceBundle bundle = ResourceBundle.getBundle("AppMessages", Locale.US);
            
            String welcomeMessage = bundle.getString("welcome.user");
            System.out.println("Resource value: " + welcomeMessage);

        } catch (java.util.MissingResourceException e) {
            System.err.println("\nExecution Error: Localization properties file or key lookup failed.");
            System.err.println("Details: " + e.toString());
        }
    }
}