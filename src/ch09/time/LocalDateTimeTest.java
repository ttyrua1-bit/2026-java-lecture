package ch09.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class LocalDateTimeTest {

    static void main() {
        LocalDate now = LocalDate.now();
        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println("현재 날짜 시간 : "+nowDt);
        LocalDateTime ofDt = LocalDateTime.of(2026,4,23,12,0,0);
        System.out.println("크리스마스 : "+ofDt);
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println(localDate+" : "+localTime);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);
        System.out.println(nowDt.isAfter(ofDt));
        System.out.println(nowDt.isBefore(ofDt));
        System.out.println(localDate.isEqual(now));


    }

}
