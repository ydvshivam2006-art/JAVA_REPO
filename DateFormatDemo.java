import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH);
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Standard Format: " + now.format(format1));
        System.out.println("Long Month Format: " + now.format(format2));
        System.out.println("Day and Date: " + now.format(format3));
        System.out.println("ISO with Time: " + now.format(format4));
    }
}