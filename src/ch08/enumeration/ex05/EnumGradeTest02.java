package ch08.enumeration.ex05;

public class EnumGradeTest02 {
    static void main() {
        //Grade vip = new Grade();
        //타입 안정성
        int price = 10000;
        System.out.println("BASIC의 할인 금액 "+Grade.BASIC.discount(price));
        System.out.println("GOLD의 할인 금액 "+Grade.GOLD.discount(price));
        System.out.println("DIAMOND의 할인 금액 "+Grade.DIAMOND.discount(price));
    }
}
