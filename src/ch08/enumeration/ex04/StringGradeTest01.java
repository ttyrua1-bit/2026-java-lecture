package ch08.enumeration.ex04;

public class StringGradeTest01 {
    static void main() {
        //Grade vip = new Grade();
        //타입 안정성
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int basic = discountService.discount(Grade.BASIC,price);
        int gold = discountService.discount(Grade.GOLD,price);
        int diamond = discountService.discount(Grade.DIAMOND,price);
        //int vip = discountService.discount(Grade.VIP,price);

        System.out.println("BASIC 등급의 할인 금액 : "+basic);
        System.out.println("GOLD 등급의 할인 금액 : "+gold);
        System.out.println("DIAMOND 등급의 할인 금액 : "+diamond);
    }
}
