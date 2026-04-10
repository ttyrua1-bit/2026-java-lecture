package ch04;

public class TvTest {
    static void main() {
        //메서드 정의
        //tv끄기
        //turnOff();
        //ty를 끕니다.

        TV myTv = new TV();
        myTv.brand = "samsung";
        myTv.size = 60;
        myTv.pixel = 3000000;
        myTv.turnOn();
        myTv.showInfo();
        myTv.turnOff();

        TV yourTv = new TV();
        yourTv.brand="LG";
        yourTv.size = 70;
        yourTv.pixel=40000000;
        yourTv.showInfo();








    }
}
