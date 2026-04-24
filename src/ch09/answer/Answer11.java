package ch09.answer;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

// 시작일: 2025-11-18
// 종료일: 2026-08-07


public class Answer11 {
    static void main() {
        LocalDate start = LocalDate.of(2025,11,18);
        LocalDate end = LocalDate.of(2026,8,7);
        Period period = Period.between(start,end);
        System.out.println(period.getYears()+"년"+period.getMonths()+"월"+period.getDays()+"일 남았습니다.");
        System.out.println("총일수 : "+ ChronoUnit.DAYS.between(start,end));
        System.out.println("총개월수 : "+ ChronoUnit.MONTHS.between(start,end));
        System.out.println("총주 : "+ ChronoUnit.WEEKS.between(start,end));
    }
}
