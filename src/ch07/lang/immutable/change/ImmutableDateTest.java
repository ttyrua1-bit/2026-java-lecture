package ch07.lang.immutable.change;

import java.util.Calendar;

public class ImmutableDateTest {
    static void main() {
        ImmutableDate currentDate =
                new ImmutableDate(2026,4,20);
        ImmutableDate plusOneYearDate = currentDate.withYear(2027);
        System.out.println(currentDate+"==="+plusOneYearDate);
    }
}
