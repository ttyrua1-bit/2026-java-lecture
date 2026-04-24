package ch09.answer;

import java.time.LocalDate;

//2026-01-31+1개월=2026-02-28
//2026-03-31+1개월=2026-04-30
//2024-01-31+1개월=2024-02-29


public class Answer07 {
    static void main() {
        System.out.println(LocalDate.of(2025,1,31).plusMonths(1));
        System.out.println(LocalDate.of(2025,3,31).plusMonths(1));
        System.out.println(LocalDate.of(2024,1,31).plusMonths(1));
    }
}
