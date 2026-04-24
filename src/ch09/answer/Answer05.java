package ch09.answer;

import java.time.Duration;
import java.time.LocalTime;

public class Answer05 {
    static void main() {
        //출근 09:10 퇴근 18:45  점심시간 1시간 제외
        LocalTime start = LocalTime.of(9, 10);
        LocalTime end = LocalTime.of(18, 45);
        Duration duration = Duration.between(start, end)
                .minusHours(1);
        long hour = duration.toHours();
        long min = duration.toMinutes() % 60;
        long min02 = duration.toMinutesPart();
        System.out.println(hour + "시간 " + min02 + "분");
    }
}
