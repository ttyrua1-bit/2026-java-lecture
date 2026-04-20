package ch07.lang.immutable.address;

public class ReferenceTest02 {
    static void main() {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        //b.setValue("부산");  컴파일 오류 setter는 없다
        b = new ImmutableAddress("부산");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
