package mdc.dateandtimejava8api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate date = LocalDate.parse("02-15-2010", formatter);
        LocalTime time = LocalTime.parse("11:33");

        System.out.println("Parsed Date: " + date); // Parsed Date: 2010-02-15
        System.out.println("Parsed Time: " + time); // Parsed Time: 11:33

        String text = date.format(formatter);
        System.out.println("Formatted Text: " + text); // Formatted Text: 02-15-2010
        LocalDate parsedDate = LocalDate.parse(text, formatter);// this is the same as line 10
        System.out.println("Parsed Date 2: " + parsedDate); // Parsed Date 2: 2010-02-15

        LocalDate myDate = LocalDate.of(2010, Month.MAY, 5);
        System.out.println(myDate.getDayOfWeek() + " " +myDate.getMonth()+
                ", 0" + myDate.getMonthValue() +
                "-0" + myDate.getDayOfMonth() +
                "-"+
                myDate.getYear());
        System.out.println("Date: " + myDate ); // Date: 2010-05-05
        String dateString = formatter.format(myDate);
        System.out.println("Date String: " + dateString); // Date String: 05-05-2010

        LocalDate anotherDate = LocalDate.parse(dateString, formatter);
        System.out.println("Another Date: " + anotherDate); // returns Another Date: 2010-05-05
        anotherDate = anotherDate.plusMonths(5).plusDays(5);
        System.out.println("Another Date with 5 more months and 5 more days: " + formatter.format(anotherDate));
        // returns Another Date with 5 more months and 5 more days: 10-10-2010

    }
}
