package ch08.enumeration.ex03;

public class DiscountService {
    public int discount(ClassGrade grade, int price) {
        int discountPercent = 0;
        if(grade.equals(ClassGrade.BASIC)) {
            discountPercent = 10;
        } else if(grade.equals(ClassGrade.GOLD)) {
            discountPercent = 20;
        } else if(grade.equals(ClassGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade +" : 할인 없음");
        }
        return price * discountPercent / 100;
    }
}
