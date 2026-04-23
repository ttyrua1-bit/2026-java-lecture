package ch09.test423;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;



public class Test09 {
    static void main() {

        LocalDateTime day = LocalDateTime.of(2026,11,7,16,25,40);
        System.out.println("연도: "+day.get(ChronoField.YEAR));
        System.out.println("월: "+day.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("일: "+day.get(ChronoField.DAY_OF_MONTH));
        System.out.println("시: "+day.get(ChronoField.HOUR_OF_DAY));
        System.out.println("분: "+day.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("초: "+day.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println("해당 달의 몇번째 날: "+day.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        System.out.println("해당 주의 몇 번째 요일: "+day.get(ChronoField.DAY_OF_WEEK));



    }
}
