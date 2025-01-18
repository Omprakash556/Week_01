import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class TimeZoneExample {

    public static void main(String[] args) {

        // Get current time in GMT (Greenwich Mean Time)
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // Get current time in IST (Indian Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Get current time in PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Define a formatter to display time in a readable format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Display current time in each time zone
        System.out.println("Current time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current time in IST: " + istTime.format(formatter));
        System.out.println("Current time in PST: " + pstTime.format(formatter));
    }
}

