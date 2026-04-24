package ch09.answer;

import java.time.Duration;
import java.time.LocalDateTime;

//시작: 22:30
//종료: 다음날 06:10


public class Answer12 {
    static void main() {
        LocalDateTime start = LocalDateTime.of(2026,4,24,22,30);
        LocalDateTime end = LocalDateTime.of(2026,4,25,6,10);
        Duration duration = Duration.between(start,end);
        System.out.println(duration.toHours()+"시간 "+duration.toMinutesPart()+"분");
    }
}
