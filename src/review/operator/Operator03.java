package review.operator;

public class Operator03 {

    static void main() {
        int a = 2;
        int b = 3;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        boolean result = a == b;  //"=는 대입연산자이다. 우항을 연산해서 좌항에 넘긴다. 제일 나중에 연산한다."
        System.out.println(result);
    }


}
