package ch09.test423;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test10 {
    static void main() {
        LocalDate goal = LocalDate.of(2026,12,25);

        LocalDate day = LocalDate.now();

        if(day.isBefore(goal)){
            System.out.println("D-"+ChronoUnit.DAYS.between(day,goal));
        }
        if(day.isAfter(goal)){
            System.out.println("D+"+ChronoUnit.DAYS.between(goal,day));
        }
        if(day.isEqual(goal)){
            System.out.println("D-Day");
        }





    }



}
