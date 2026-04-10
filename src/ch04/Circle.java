package ch04;

public class Circle {
    //생성자  연산자, 클래스랑 이름이 같아야한다.
    //class

    int radius = 10;
    String name;

    Circle(){
        System.out.println("생성자도 결국 함수다");
        //생성자 두개만들수있는데 이름은 같아도 되는데
        //타입을 붙이지않고 처음시작할때 호출함
        radius = 100;
    }
    Circle(int _radius){
        //생성자가 여러개있는거: 생성자 오버로드 라한다. 세개도 가능
        System.out.println("나는 매개변수를 가지는 생성자 함수이다.");
        radius = 100;
    }


    Circle(String _name,int _radius ){

    }




    //생성자 안적어도 디폴트로 생김
    //오버라이드는 기존의 함수를 덮어써버리는것



}
