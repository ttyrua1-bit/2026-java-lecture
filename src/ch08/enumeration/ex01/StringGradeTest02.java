package ch08.enumeration.ex01;

public class StringGradeTest02 {
    static void main() {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int vip = discountService.discount("VIP",price);
        int gold = discountService.discount("gold",price);
        int diamond = discountService.discount("DIAMONDD",price);
        System.out.println("VIP 등급의 할인 금액 : "+vip);
        System.out.println("GOLD 등급의 할인 금액 : "+gold);
        System.out.println("DIAMOND 등급의 할인 금액 : "+diamond);
    }
}
