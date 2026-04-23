package ch09.test423;

import java.time.LocalDate;


public class Test07 {
    static void main() {
        LocalDate num1 = LocalDate.of(2026,1,31);
        LocalDate num2 = LocalDate.of(2026,3,31);
        LocalDate num3 = LocalDate.of(2024,1,31);

        System.out.println(num1+" + 1개월 = "+num1.plusMonths(1));
        System.out.println(num2+" + 1개월 = "+num2.plusMonths(1));
        System.out.println(num3+" + 1개월 = "+num3.plusMonths(1));






    }

}
