package ch09.time;

import java.time.LocalDate;
import java.time.Period;


public class PeriodTest {
    static void main() {
        // 몇시 몇분 몇초
        // period 3개월 짜리 프로젝트
        // 100일 기념일까지 20일 남았다
        // Period     년월일
        // Duration   시분초
        Period period = Period.ofDays(10);
        System.out.println("period = "+period);
        //계산에 사용
        LocalDate currentDate =  LocalDate.of(2030,1,1);
        LocalDate plusDate = currentDate.plus(period);
        LocalDate plusDate02 = currentDate.plusDays(10);
        System.out.println("현재 날짜 : "+currentDate);
        System.out.println("더한 날짜 : "+plusDate);
        System.out.println("더한 날짜 : "+plusDate02);

        LocalDate startDate = LocalDate.of(2026,4,23);
        LocalDate xmas = LocalDate.of(2026,12,25);
        Period between =  Period.between(startDate,xmas);
        System.out.println("between = "+between.getMonths()+"개월"+between.getDays()+"일");
    }

}
