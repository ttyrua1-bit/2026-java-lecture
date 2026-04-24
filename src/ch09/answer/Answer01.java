package ch09.answer;

import java.time.LocalDate;
import java.time.temporal.ChronoField;


public class Answer01 {
    static void main() {
        LocalDate today = LocalDate.now();
        int year = today.getYear(); //편의 메서드
        //int year = today.get(ChronoField.YEAR);
        //System.out.println(year);
        String leafYear = today.isLeapYear()?"윤년":"평년";
        System.out.println("올해 : "+year +" / "+leafYear);
    }



}
