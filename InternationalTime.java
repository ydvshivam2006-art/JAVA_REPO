import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class InternationalTime {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();

        DateTimeFormatter ukFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                                        .withLocale(Locale.UK);
        
        ZonedDateTime usTime = now.withZoneSameInstant(ZoneId.of("America/New_York"));
        DateTimeFormatter usFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm a")
                                        .withLocale(Locale.US);

        ZonedDateTime japanTime = now.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter japanFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")
                                        .withLocale(Locale.JAPAN);

        System.out.println("UK Format: " + now.format(ukFormat));
        System.out.println("US (New York) Format: " + usTime.format(usFormat));
        System.out.println("Japan (Tokyo) Format: " + japanTime.format(japanFormat));
    }
}