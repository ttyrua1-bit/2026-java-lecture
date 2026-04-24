package ch09.answer;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Answer04 {
    static void main() {
        LocalDate start = LocalDate.of(2026,4,23);
        LocalDate end = LocalDate.of(2026,12,25);
        Period period = Period.between(start,end);
        //System.out.println(period);
        System.out.println(period.getMonths()+"개월"+period.getDays()+"일");
        long months = ChronoUnit.MONTHS.between(start,end);
        System.out.println(months);
        LocalDate temp = start.plusMonths(months);
        long days = ChronoUnit.DAYS.between(temp,end);
        System.out.println(days);
        System.out.println(months+"개월"+days+"일");
    }
}
