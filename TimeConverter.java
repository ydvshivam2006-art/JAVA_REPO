import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeConverter {
    public static void main(String[] args) {
        
        LocalTime now = LocalTime.now();
        DateTimeFormatter amPmFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime = now.format(amPmFormatter);
        System.out.println("Formatted Time: " + formattedTime);

        ZonedDateTime localDateTime = ZonedDateTime.now();
        ZonedDateTime gmtDateTime = localDateTime.withZoneSameInstant(ZoneId.of("GMT"));
        DateTimeFormatter gmtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Local Time: " + localDateTime.format(gmtFormatter));
        System.out.println("GMT Time: " + gmtDateTime.format(gmtFormatter));
    }
}