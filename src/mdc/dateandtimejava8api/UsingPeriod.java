package mdc.dateandtimejava8api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {
    public static void main(String[] args) {

        // ISO 8601	Meaning
        // P1Y1M1DT1H1M1.1S	=> One year, one month, one day, one hour, one minute, one second, and 100 milliseconds
        // P40D	=> Forty days
        // P1Y1D	=> A year and a day
        // P3DT4H59M	=> Three days, four hours and 59 minutes
        // PT2H30M	=> Two and a half hours
        // P1M	=> One month
        // PT1M	=> One minute
        // PT0.0021S	=> 2.1 milliseconds (two milliseconds and 100 microseconds)
        // PT0S	=> Zero
        // P0D	=> Zero

        LocalDate date = LocalDate.now();
        System.out.println("The month of " + date + " is " + date.getMonth());
        System.out.println("The year of " + date + " is " + date.getYear());
        System.out.println("The day of the week for " + date + " is " + date.getDayOfWeek());
        System.out.println("The day of the month for " + date + " is " + date.getDayOfMonth());
        System.out.println("The day of the year for " + date + " is " + date.getDayOfYear());
        System.out.println("The value of the month for " + date + " is " + date.getMonthValue());

        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        Period period = Period.ofWeeks(2);
        Period period1 = Period.ofDays(1);
        Period period2 = Period.ofYears(1);
        System.out.println("Adding 2 weeks");
        System.out.println("-----------------------------------------------");
        cleanAnimalCage(start, end, period);
        System.out.println("-----------------------------------------------");
        System.out.println("Adding 1 month");
        System.out.println("-----------------------------------------------");
        cleanAnimalCage(start, end);
        System.out.println("-----------------------------------------------");

        System.out.println("Original Date: " + start);
        System.out.println("Date plus 2 weeks: " + start.plus(period));
        System.out.println("Date plus 2 weeks plus 1 day: " + start.plus(period).plus(period1));
        System.out.println("Date plus 2 weeks plus 1 day plus 1 year: " + start.plus(period).plus(period1).plus(period2));

        Period yearAndMonth = Period.of(1, 1, 1);
        Period fortyDays = Period.of(0, 0, 40);
        System.out.println("YearAndMonth = " + yearAndMonth);
        System.out.println("Forty Days: " + fortyDays);
    }
    public static void cleanAnimalCage(LocalDate start, LocalDate end){
        while(start.isBefore(end)){
            System.out.println("Need to clean the cage on date = " + start);
            start = start.plusMonths(1);// adding 1 month
        }
    }
    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date = " + start);
            start = start.plus(period); // adding 2 weeks
        }
    }
}
