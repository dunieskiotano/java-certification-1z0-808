package mdc.dateandtimejava8api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2010, Month.APRIL, 15);
        LocalTime time = LocalTime.of(11, 22,33);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println("DateTime without formatting: " + dateTime); //DateTime without formatting: 2010-04-15T11:22:33
        System.out.println("Local Date: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)); // Local Date: 2010-04-15
        System.out.println("Local DateTime: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // Local DateTime: 2010-04-15T11:22:33
        System.out.println("Local Time: " + dateTime.format((DateTimeFormatter.ISO_LOCAL_TIME))); // Local Time: 11:22:33
        System.out.println("Date With No Dashes: " + dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));// Date With No Dashes: 20100415

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("DateTime Short Format: " + shortFormatter.format(dateTime)); // DateTime Short Format: 4/15/10
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("Date Medium Format: " + mediumFormatter.format((date))); // Date Medium Format: Apr 15, 2010

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd, yyyy, hh:mm");
        System.out.println("Date Time with Pattern: " + dateTime.format(formatter)); // 04 15, 2010, 11:22

        SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Time With Pattern: " + sf.format(new Date())); // Time With Pattern: 07:44:02

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("DateTime with Pattern 2: " + dtf.format(dateTime));
        System.out.println("DateTime with Pattern 3: " + dtf.format(time));
        //System.out.println("Date Time with Pattern 3: " + dtf.format(date)); // this does not compile, throws exception, unsupported format

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Date with Pattern 4: " + tf.format(date));

    }
}
