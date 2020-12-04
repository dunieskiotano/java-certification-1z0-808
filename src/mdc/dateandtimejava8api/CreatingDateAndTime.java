package mdc.dateandtimejava8api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CreatingDateAndTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 1);
        LocalTime localTime = LocalTime.of(10, 30);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println("local date: " + localDate);
        System.out.println("local time: " + localTime);
        System.out.println("local date-time = " + localDateTime);

        // before Java 8
        System.out.println(new Date());

        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = calendar.getTimeZone();
        System.out.println("dst Savings " + timeZone.getDSTSavings());
        System.out.println("My time zone is " + timeZone.getID());
        calendar.set(2015, Calendar.JANUARY, 1);
        Date january = calendar.getTime();
        System.out.println(january);


    }
}
