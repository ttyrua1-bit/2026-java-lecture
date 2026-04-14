package ch05.casting;

public class PolyTest {
    static void main() {
        System.out.println("Parent => Child");
        Parent parent = new Parent();
        parent.parentMethod();
        //자식을 부모타입으로 변환
        System.out.println("Child => Parent");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        //부모가 자식을 참조
        System.out.println("Parent = > Child");
        Parent poly =  new Child();
        poly.parentMethod();
        Child polyChild = (Child)poly;
        polyChild.childMethod();
        ((Child)poly).childMethod();

    }



}
