package ch09.test423;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test02 {
    static void main() {
        LocalDate now = LocalDate.now();
        System.out.println("오늘 날짜:"+now);

        LocalDate lastday = LocalDate.of(now.getYear(), 12,31);
        System.out.println("올해 마지막 날:"+lastday);


        System.out.println("남은 일수:"+ChronoUnit.DAYS.between(now,lastday));


    }


}
