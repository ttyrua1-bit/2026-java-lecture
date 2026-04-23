package ch09.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest {

    static void main() {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = "+duration);
        LocalTime localTime = LocalTime.of(14,0);
        System.out.println("기준 시간 : "+localTime);
        //계산
        LocalTime plusTime = localTime.plus(duration);
        System.out.println("더한 시간 : "+plusTime);

        //시간 차이
        LocalTime startTime =  LocalTime.now();
        LocalTime endTime =  LocalTime.of(18,0);
        Duration between =  Duration.between(startTime,endTime); //***
        System.out.println("차이 : "+between.getSeconds()+"초");
        System.out.println("차이 : "+between.toHours()+"시간"+between.toMinutes()+"분");
    }





}
