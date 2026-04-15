package ch06.basic;

public class CastingTest {
    static void main() {
        //자식을 부모타입으로 변경 up-casting
        Parent poly = new Child();  //자식은 생성될때 부모타입가지고있는다.
        //부모를 자식타입으로 변경 down-casting
        Child child = (Child)poly;
        child.childMethod();

        Parent parent = new Parent();
        Child child02 = (Child) parent;
        child02.childMethod();
        //upcasting은 안전하다.
        //downcasting은 위험하다.




    }
}
