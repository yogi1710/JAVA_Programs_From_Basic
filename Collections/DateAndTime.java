import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
// importing ZonedDateTime
import java.time.ZonedDateTime;
import java.time.ZoneId;
// import peroid
// import java.time.temporal.ChronoUnit;
// import java.time.temporal.Period;

public class DateAndTime {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentDate);
        System.out.println(currentTime);
        // The above used date and time are used individually
        // To print the date and time together, we use localDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        // To get exact month, date or year
        System.out.println("Getting date values : ");
        System.out.println(currentDate.getDayOfMonth());
        System.out.println(currentDate.getMonthValue());
        System.out.println(currentDate.getYear());
        // To get hour, min or sec
        System.out.println("Getting time values : ");
        System.out.println(currentTime.getHour());
        System.out.println(currentTime.getMinute());
        System.out.println(currentTime.getSecond());
        System.out.println(currentTime.getNano());
        System.out.printf("%d:%d:%d", currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond());
        System.out.println();
        // Setting the time and date manually
        LocalDateTime dt = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        System.out.println(dt);
        // Adding values to the above date
        System.out.println(dt.plusMonths(6));
        System.out.println(dt.plusDays(30));
        System.out.println(dt.plusYears(2));
        System.out.println(dt.plusSeconds(60));
        System.out.println(dt.plusMinutes(60));
        System.out.println(dt.plusHours(7));

        // Removing values form the above date
        System.out.println(dt.minusMonths(4));
        System.out.println(dt.minusDays(8));
        System.out.println(dt.minusYears(7));
        System.out.println(dt.minusSeconds(70));
        System.out.println(dt.minusMinutes(60));
        System.out.println(dt.minusHours(10));

        // using ZoneId,
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zdt = dt.atZone(zoneId);
        System.out.println(zdt);

        // Finding the period between the date of birth till now
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2001, 03, 17);
        Period p = Period.between(today, birthday);
        System.out.println(p);
        // P-23Y-7M-6D this is the output for the above statement
        // period - 23 years, 7 months, 6 days ---------> explanation of the output
    }
}