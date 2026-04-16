package review.operator;

public class Operator04 {

    static void main() {
        System.out.println("&& : AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println("|| : OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println("! : NOT 연산");//부정 연산
        System.out.println(!true);
        System.out.println(!false);
    }

}
