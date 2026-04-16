package review.condition;

public class Switch03 {
    static void main() {
        int grade = 2;
        int coupon = switch(grade){
          case 1 -> 1000;
          case 2 -> 2000;
          case 3 -> coupon = 3000;
          default -> coupon = 500;

        };
        System.out.println("발급받은 쿠폰: "+coupon);

    }



}
