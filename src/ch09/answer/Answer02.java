package ch09.answer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Answer02 {

    static void main() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        LocalDate endDay =  LocalDate.of(year,12,31);
        long days = ChronoUnit.DAYS.between(today,endDay);
        System.out.println("올해 남은 날짜 : "+days);
    }

}
