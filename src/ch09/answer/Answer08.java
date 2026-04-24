package ch09.answer;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class Answer08 {
    static void main() {
        LocalDate localDate = LocalDate.of(2026, 4, 26);
        //System.out.println(localDate.getDayOfWeek());
        String yoil = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);
        System.out.println(yoil);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String day = switch (dayOfWeek) {
            case MONDAY -> "월요일";
            case TUESDAY -> "화요일";
            case WEDNESDAY -> "수요일";
            case THURSDAY -> "목요일";
            case FRIDAY -> "금요일";
            case SATURDAY -> "토요일";
            case SUNDAY -> "일요일";
        };
        System.out.println(day);
        String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        int value = localDate.getDayOfWeek().getValue();
        System.out.println(days[value - 1]);
    }

}
