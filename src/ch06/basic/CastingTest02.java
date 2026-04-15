package ch06.basic;

public class CastingTest02 {

    static void main() {
        Parent parent01 = new Parent();
        System.out.println("parent01 호출");
        parent01.parentMethod();
        //다운캐스팅을 통해서 자식메서드를 호출할떄 instanceOf를 써서 타입체크를 하는게 좋다.
        if(parent01 instanceof Child) {
            Child child01 = (Child) parent01;
            child01.childMethod();
        }

        Parent parent02 = new Child();
        System.out.println("parent02 호출");
        parent02.parentMethod();
        if(parent02 instanceof Child) {
            Child child02 = (Child) parent02;
            child02.childMethod();
        }
//        Child child02 = (Child) parent02;
//        child02.childMethod();

        System.out.println("==="+(new Parent() instanceof Parent));  //참
        System.out.println("==="+(new Child() instanceof Parent));   //참
        System.out.println("==="+(new Parent() instanceof Child));   //거짓,
        System.out.println("==="+(new Child() instanceof Child));    //참
    }



}
