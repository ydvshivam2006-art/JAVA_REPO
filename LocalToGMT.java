import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalToGMT {
    public static void main(String[] args) {
        ZonedDateTime localTime = ZonedDateTime.now();
        ZonedDateTime gmtTime = localTime.withZoneSameInstant(ZoneId.of("GMT"));
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        
        System.out.println("Local Time: " + localTime.format(formatter));
        System.out.println("GMT Time: " + gmtTime.format(formatter));
    }
}