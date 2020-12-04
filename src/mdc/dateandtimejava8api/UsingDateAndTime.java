package mdc.dateandtimejava8api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDateAndTime {
    public static void main(String[] args) {

        // JAVA 8
        LocalDate date = LocalDate.of(2030, Month.JANUARY, 10);
        System.out.println("Date: " + date);
        date = date.plusDays(5).plusMonths(2);
        System.out.println("New Date: " + date);

        LocalTime time = LocalTime.of(10, 30);
        System.out.println("Time: " + time + " AM");
        time = time.plusHours(2).plusMinutes(20);
        System.out.println("New Time: " + time + " AM");

        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println("Local Date Time: " + localDateTime);
        localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
        System.out.println("New Local Date Time: " + localDateTime);

        // BEFORE JAVA 8
        Date myDate = new Date();
        //System.out.println(myDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        myDate = calendar.getTime();
        System.out.println("Date Now: " + myDate); //Date Now: Thu Dec 03 18:35:29 EST 2020
        calendar.set(Calendar.DATE, 1); // setting the day to 1
        calendar.set(Calendar.MONTH, 2); // setting the month to 2 => MARCH
        calendar.set(Calendar.YEAR, 2023); // setting the year to 2023
        myDate = calendar.getTime();
        System.out.println("Modified Date: " + myDate); // Modified Date: Wed Mar 01 18:35:29 EST 2023


        // exam tricks
        LocalDate ld = LocalDate.of(2010, Month.APRIL, 1);
        ld.plusDays(10).plusWeeks(2).minusDays(20).minusWeeks(5); // result is ignored
        System.out.println("Modified ld: " + ld); // 2010-04-01

        LocalTime lt = LocalTime.of(12, 45);
        lt.plusMinutes(23).plusHours(12);// the result will be ignored
        System.out.println("Modified Time: " + lt); // 12:45

    }
}
