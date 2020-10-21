package assignment6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dateOfJoining = LocalDate.of(2018, Month.AUGUST, 6);

        Period experience = Period.between(dateOfJoining, today);

        System.out.println("Experience in Wipro: " + experience.getYears() + " Years " + experience.getMonths() + " Months " + experience.getDays() + " Days");
    }
}
