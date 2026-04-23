package ch09.test423;

import java.time.LocalDateTime;


public class Test06 {
    static void main() {
        LocalDateTime start = LocalDateTime.of(2026,5,10,14,30);

        LocalDateTime early = start.minusMinutes(90);

        System.out.println("회의 시작 시각: "+start);
        System.out.println("90분 전 시각: "+early);






    }


}
