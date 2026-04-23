package ch09.time;

import java.time.LocalDate;

public class LocalDateTest {
    //시간 날짜
    static void main() {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 : "+nowDate);
        LocalDate ofDate = LocalDate.of(2000,2,27);
        System.out.println("올해 크리스마스 : "+ofDate);
        LocalDate plus10Days = nowDate.plusDays(10);
        System.out.println(nowDate+"==="+plus10Days);
        LocalDate ofDatePlus10Days = ofDate.plusDays(10);
        System.out.println(ofDatePlus10Days);
    }

}
