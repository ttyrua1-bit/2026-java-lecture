package ch07.lang.immutable.address;

public class PrimitiveTest01 {
    static void main() {
        int a = 10;
        int b = a;  //기본 타입은 값을 복사해서 대입한다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
