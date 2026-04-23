package ch09.test423;

import java.time.LocalDate;


public class Test08 {

    static void main() {

        LocalDate day = LocalDate.of(2026,4,26);

        //Sunday(일요일), Monday(월요일), Tuesday(화요일), Wednesday(수요일),
        // Thursday(목요일), Friday(금요일), Saturday(토요일)

         String days = switch(day.getDayOfWeek()){
             case MONDAY -> "월요일";
             case  TUESDAY-> "화요일";
             case WEDNESDAY -> "수요일";
             case THURSDAY -> "목요일";
             case FRIDAY -> "금요일";
             case SATURDAY -> "토요일";
             case SUNDAY -> "일요일";
        };

        System.out.println(day+"의 요일은 "+days+"입니다.");



    }







}
