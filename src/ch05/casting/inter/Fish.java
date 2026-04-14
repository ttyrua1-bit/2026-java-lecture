package ch05.casting.inter;

public class Fish implements Animal,Swimable{


    @Override
    public void sound() {
        System.out.println("물고기도 소리를 냅니다.");
    }

    @Override
    public void move() {
        System.out.println("물고기도 움직입니다.");
    }

    @Override
    public void swim() {
        System.out.println("물고기가 헤엄칩니다.");
    }
}
