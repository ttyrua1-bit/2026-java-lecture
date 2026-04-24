package ch09.answer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

//연도:2026
//월:11
//일:7
//시:16
//분:25
//초:40
//해당 달의 몇 번째 날:7
//해당 주의 몇 번째 요일:6


public class Answer09 {

    static void main() {
        LocalDateTime localDateTime = LocalDateTime.of(2026,11,7,16,25,40);
        int year = localDateTime.get(ChronoField.YEAR);
        int month = localDateTime.get(ChronoField.MONTH_OF_YEAR);
        int day = localDateTime.get(ChronoField.DAY_OF_MONTH);
        int hour = localDateTime.get(ChronoField.HOUR_OF_DAY);
        int min = localDateTime.get(ChronoField.MINUTE_OF_HOUR);
        int sec = localDateTime.get(ChronoField.SECOND_OF_MINUTE);
        int yoil = localDateTime.get(ChronoField.DAY_OF_WEEK);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(min);
        System.out.println(sec);
        System.out.println(yoil);
    }
}
