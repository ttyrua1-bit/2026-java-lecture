package ch09.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class ChangeTimeWithTest {
    static void main() {
        LocalDateTime dt = LocalDateTime.of
                (2018,4,24,13,05,59);
        System.out.println(dt);
        LocalDateTime chDt = dt.with(ChronoField.YEAR,2026); //연도만 바꿀수있다.
        LocalDateTime chDt02 = dt.withYear(2026);      //위의 코드 줄인것
        System.out.println(chDt);
        System.out.println(chDt02);
        System.out.println("==============");
        LocalDateTime with01 =  chDt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜 : "+dt);
        System.out.println("다음 금요일 : "+with01);
        LocalDateTime with02 =  chDt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("이번 달 마지막 일요일 : "+with02);

    }


}
