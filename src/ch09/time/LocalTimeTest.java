package ch09.time;

import java.time.LocalTime;

public class LocalTimeTest {
    static void main() {
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간 : "+nowTime);
        LocalTime ofTime = LocalTime.of(11,45,10);
        System.out.println("지정 시간 : "+ofTime);
        LocalTime plusTime = ofTime.plusHours(3);
        System.out.println(plusTime);
    }

}
