package ch08.test;

public class Test01 {
    static void main() {
        Day today = Day.FRIDAY;
        if (today == Day.FRIDAY) {
            System.out.println("1. 오늘은 금요일");
        }
        String today02 = "FRIDAY";
        Day day02 = Day.valueOf(today02); //String을 Day 로 형변환
        if (day02 == Day.FRIDAY) {
            System.out.println("2. 오늘은 금요일");
        }
        if(today02.equals(Day.FRIDAY.name())) {
            System.out.println("3. 오늘은 금요일");
        }
    }
}
