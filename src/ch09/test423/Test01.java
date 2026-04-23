package ch09.test423;

import java.time.LocalDate;


public class Test01 {
    static void main() {
        int currentYear = LocalDate.now().getYear();

        System.out.println("현재 연도:"+currentYear);

        LocalDate now = LocalDate.now();

        boolean a = now.isLeapYear();
        System.out.println("윤년 여부:"+a);





    }


}
