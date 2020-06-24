package java8.epamTraining.dates;

import java.time.*;

public class Dates {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2020,6,24));
        System.out.println(LocalDate.of(2020, Month.FEBRUARY,24));
        System.out.println("Day of year: " + LocalDate.ofYearDay(2020, 350));

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(12,20));

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2019,10,2,12,30));

        System.out.println(LocalTime.now(ZoneId.of("America/New_York")));
        System.out.println(LocalTime.now(Clock.systemUTC()));

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
