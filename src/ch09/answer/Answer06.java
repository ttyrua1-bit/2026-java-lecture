package ch09.answer;

import java.time.LocalDateTime;

public class Answer06 {

    static void main() {
        LocalDateTime localDateTime = LocalDateTime.of(2026,5,10,14,30);
        LocalDateTime minus90 = localDateTime.minusMinutes(90);
        System.out.println(minus90);
    }
}
