package review.condition;

public class Ex01 {
    static void main() {
        int distance = 25;
        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance < 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }
        int a = 20;
        int b = 10;
        int big;
        if (a > b) {
            big = a;
        } else {
            big = b;
        }
        big = a > b ? a : b; //삼항연산자.
        System.out.println(big);
        int c = 10;
        int d = 15;
        System.out.println(c-d);
        if(c-d>0) {
            System.out.println(c-d);
        } else {
            System.out.println(d-c);
        }
        int gap =  c-d>0?c-d:d-c;
        System.out.println(gap);
    }


}
