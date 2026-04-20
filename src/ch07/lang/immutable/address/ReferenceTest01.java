package ch07.lang.immutable.address;

public class ReferenceTest01 {
    static void main() {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        b.setValue("부산"); //side effect  내가 원하지 않았던 부수 효과
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
