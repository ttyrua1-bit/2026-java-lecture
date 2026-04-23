package ch09.test423;

import java.time.LocalDate;


public class Test03 {
    static void main() {

        LocalDate oct = LocalDate.of(2026,10,15);

        int day = oct.getDayOfYear();


        System.out.println(oct+"는 올해의 "+day+"번째 날입니다.");






    }


}
