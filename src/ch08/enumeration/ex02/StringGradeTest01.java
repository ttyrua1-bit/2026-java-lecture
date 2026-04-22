package ch08.enumeration.ex02;

public class StringGradeTest01 {
    static void main() {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int basic = discountService.discount(StringGrade.BASIC,price);
        int gold = discountService.discount(StringGrade.GOLD,price);
        int diamond = discountService.discount(StringGrade.DIAMOND,price);
        System.out.println("BASIC 등급의 할인 금액 : "+basic);
        System.out.println("GOLD 등급의 할인 금액 : "+gold);
        System.out.println("DIAMOND 등급의 할인 금액 : "+diamond);
    }
}
