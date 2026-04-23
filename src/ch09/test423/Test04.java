package ch09.test423;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;


public class Test04 {
    static void main() {
        LocalDate now = LocalDate.now();

        LocalDate last = LocalDate.of(now.getYear(), 12,25);

        long month = ChronoUnit.MONTHS.between(now,last);

        LocalDate last2 = now.plusMonths(month);

        long days = ChronoUnit.DAYS.between(last2,last);

        System.out.println(month+"개월 "+days+"일");




    }



}
