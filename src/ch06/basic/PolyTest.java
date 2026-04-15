package ch06.basic;

public class PolyTest {
    static void main() {

        System.out.println("Parent => Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child => Child");
        Child child = new Child();
        child.childMethod();

        System.out.println("Parent => Child");
        Parent poly = new Child();
        poly.parentMethod();

        //child polyChild = (Child)new Parent();
        //polyChild.childMethod();
        //자식은 부모를 담을 수 없다.






    }

}
