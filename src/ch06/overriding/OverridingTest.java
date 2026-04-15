package ch06.overriding;

public class OverridingTest {

    static void main() {
        Child child = new Child();
        System.out.println("Child => Child");
        System.out.println("value = " + child.value);
        child.method();
        Parent parent = new Parent();
        System.out.println("Parent => Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        Parent poly = new Child(); //*****
        System.out.println("Parent => Child");
        System.out.println("value = " + poly.value); //parent
        poly.method();
        //동적바인딩  부모타입이지만 메서드 오버라이드가 되면 자식 메서드가 호출된다. *****


    }
}