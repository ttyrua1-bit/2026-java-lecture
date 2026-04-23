package ch09.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    //ChronoUnit(시간 차 몇시간 차이냐) vs ChronoField(값을 끄집어 낼떄  몇시냐)
    static void main() {
        ChronoUnit [] values = ChronoUnit.values();
        for(ChronoUnit value:values) {
            System.out.println("value : "+value);
        }
        System.out.println("=============================");
        System.out.println("Hours = "+ChronoUnit.HOURS);
        System.out.println("Hours.duration = "+ChronoUnit.HOURS.getDuration().getSeconds());
        //차이 구하기
        LocalTime localTime01 = LocalTime.of(15,10,10);
        LocalTime localTime02 = LocalTime.of(15,20,0);
        long secondBetween = ChronoUnit.SECONDS.between(localTime01,localTime02);
        System.out.println("second between = "+secondBetween);
        long secondMinute = ChronoUnit.MINUTES.between(localTime01,localTime02);
        System.out.println("second minute = "+secondMinute);
        LocalDate now = LocalDate.now();
        LocalDate xmas =  LocalDate.of(2026,12,25);
        System.out.println("크리스마스까지 남은 일 : "+ChronoUnit.DAYS.between(now,xmas));
        Period period = Period.between(now,xmas);
        System.out.println("크리스마스까지 남은 일 : "+period.getMonths()+"월"+period.getDays()+"일");
    }



}
