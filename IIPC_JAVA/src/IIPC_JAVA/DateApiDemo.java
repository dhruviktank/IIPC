package IIPC_JAVA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

class DateApiDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        
        LocalDate futureDate = currentDate.plusDays(7);
        System.out.println("Future date: " + futureDate);

        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current date and time: " + current);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = current.format(format);
        System.out.println("Formatted date and time: " + formattedDateTime);

        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Month: " + month + " Day: " + day + " Seconds: " + seconds);

        LocalDate date2 = LocalDate.of(1950, 1, 26);
        System.out.println("Republic Day: " + date2);

        LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
        System.out.println("Specific date with current time: " + specificDate);
    }
}
