package ch08.enumeration.ex02;

public class StringGradeTest02 {
    static void main() {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int vip = discountService.discount("VIP",price); //String에 StringGrade라는 상수를 쓰기로 했지만 문자열은 입력 가능
        int gold = discountService.discount("gold",price);
        int diamond = discountService.discount("DIAMONDD",price);
        System.out.println("VIP 등급의 할인 금액 : "+vip);
        System.out.println("GOLD 등급의 할인 금액 : "+gold);
        System.out.println("DIAMOND 등급의 할인 금액 : "+diamond);
    }
}
