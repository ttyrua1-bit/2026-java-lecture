package ch04;

public class TV {   //여러개의 함수 정의를 해놓을 수 있는 곳 클래스
    int size;
    int pixel;
    String brand;
    //function 정의
    //메서드(method)
    void turnOn(){
        System.out.println("전원 들어옵니다.");
    }
    void showInfo(){
        System.out.println("나의 tv 브랜드는 "+brand+ " size는 "+
                size+" 화소는 "+pixel);
    }
    void turnOff(){
        System.out.println("tv를 끕니다.");
    }

}
