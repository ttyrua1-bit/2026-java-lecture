package ch05.casting.abs;

public class Chicken extends Animal {

    String vale= "Chicken";
    void sound() {
        System.out.println("꼬꼬댁");
    }

    @Override
    void move() {
        System.out.println("닭이 살금살금 움직입니다.");
    }


}
