package ch05.casting.overriding;

public class PolyTest {

    static void main() {
        //자식 변수가 자식 인스턴스를 참조
        Child child = new Child();
        System.out.println("Child => Child");
        System.out.println("value = " + child.value);
        child.method();
        //부모 변수가 부모 인스턴스를 참조
        Parent parent = new Parent();
        System.out.println("Parent => Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스를 참조
        Parent poly = new Child();
        System.out.println("Parent => Child");
        System.out.println("value = " + poly.value);
        //자식이 부모메서드를 오바라이딩 하면 자식 메서드를 호출한다.
        poly.method(); //동적 바인딩....
    }


}
