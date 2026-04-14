package ch05.casting.inter;

public class Chicken implements Animal,Fly {

    String vale= "Chicken";
    public void sound() {
        System.out.println("꼬꼬댁");
    }

    @Override
    public void move() {
        System.out.println("닭이 살금살금 움직입니다.");
    }


    @Override
    public void Fly() {
        System.out.println("닭도 납니다");
    }
}
