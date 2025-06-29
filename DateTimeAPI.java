package org.example;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
    public static void main(String[] args) {
        // Example usage of DateTime API
        LocalDate today = LocalDate.now();//works on the basis of system clock and default time zone
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        LocalDate day=LocalDate.of(2024,06,25);

        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Yesterday: " + yesterday);
        System.out.println("Specific Date: " + day);
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalTime specificTime = LocalTime.of(14, 30); // 2:30 PM
        System.out.println("Specific Time: " + specificTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDateTime);
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 6, 25, 14, 30); // June 25, 2024, at 2:30 PM
        System.out.println("Specific DateTime: " + specificDateTime);
        ZonedDateTime zone = ZonedDateTime.now(); // Get current date and time with time zone
        System.out.println("Current ZonedDateTime: " + zone);
        ZoneId zoneId = ZoneId.of("America/New_York"); // Specify a time zone
        System.out.println(zoneId);
        String zoneIdString = zone.getZone().getId(); // Get the ID of the time zone
        System.out.println("Zone ID: " + zoneIdString);
        //ZonedDateTime works with time zones, it represents a date-time with a time zone in the ISO-8601 calendar system.
        //zoneId represents a time zone identifier, such as "America/New_York" or "Europe/Paris".
        Instant instant = Instant.now(); // Get the current instant in UTC
        System.out.println("Current Instant: " + instant);
        // Instant represents a point in time, typically used for timestamps.
        // UTC (Coordinated Universal Time) is the time standard that is used worldwide, it is not affected by time zones or daylight saving time.
        Instant specificInstant = Instant.parse("2024-06-25T14:30:00Z"); // Parse an instant from a string
        System.out.println("Specific Instant: " + specificInstant);
        // Duration represents a time-based amount of time, such as "2 hours" or "30 minutes".
        Duration duration = Duration.between(specificDateTime, currentDateTime); // Calculate the duration between two date-times
        System.out.println("Duration between specificDateTime and currentDateTime: " + duration);
        // Period represents a date-based amount of time, such as "2 days" or "3 months".
        Period period = Period.between(specificDateTime.toLocalDate(), currentDateTime.toLocalDate()); // Calculate the period between two dates
        System.out.println("Period between specificDateTime and currentDateTime: " + period);
        // Example of formatting and parsing dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter); // Format the current date-time
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
