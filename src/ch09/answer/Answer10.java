package ch09.answer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//1. 목표 날짜를 `2026-12-25`로 지정한다.
//2. 오늘 날짜를 구한다.
//3. 목표 날짜가 미래면 `D-남은일수` 형식으로 출력한다.
//4. 목표 날짜가 오늘이면 `D-Day` 출력
//5. 목표 날짜가 이미 지났으면 `D+지난일수` 형식으로 출력한다.


public class Answer10 {
    static void main() {
        LocalDate dday = LocalDate.of(2026,12,25);
        LocalDate now = LocalDate.now();
        System.out.println(now.isBefore(dday));
        System.out.println(now.isAfter(dday));
        System.out.println(now.isEqual(dday));
        boolean isBefore = now.isBefore(dday);
        boolean isAfter = now.isAfter(dday);
        boolean isEqual = now.isEqual(dday);
        if(isBefore) {
            System.out.println("D-"+ChronoUnit.DAYS.between(now,dday));
        } else if(isAfter) {
            System.out.println("D+"+ChronoUnit.DAYS.between(dday,now));
        } else {
            System.out.println("D-DAY");
        }
    }
}
