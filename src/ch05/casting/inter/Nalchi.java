package ch05.casting.inter;

public class Nalchi implements Animal, Swimable, Fly{


    @Override
    public void sound() {
        System.out.println("날치가 소리를 냅니다.");
    }

    @Override
    public void move() {
        System.out.println("날치가 움직입니다.");
    }

    @Override
    public void Fly() {
        System.out.println("날치가 납니다.");
    }

    @Override
    public void swim() {
        System.out.println("날치가 헤엄칩니다.");
    }
}
