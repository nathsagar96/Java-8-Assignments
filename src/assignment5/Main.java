package assignment5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        //get current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        //find second sunday of next month
        LocalDate secondSundayOfNextMonth = currentDate.plusMonths(1)
                .with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

        //Display date of the second sunday of next month
        System.out.println("2nd Sunday of next month is " + secondSundayOfNextMonth);
    }
}
