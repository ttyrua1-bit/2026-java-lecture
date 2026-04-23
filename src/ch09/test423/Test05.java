package ch09.test423;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Test05 {
    static void main() {

        LocalTime start = LocalTime.of(9,10);
        LocalTime last = LocalTime.of(18,45);

        LocalTime last2 = last.minusHours(1);

        Duration betw = Duration.between(start,last2);

        // *******
        System.out.println("총 근무 시간:"+betw.toHours()+"시간"+betw.minusHours(8).toMinutes()+"분");







    }


}
