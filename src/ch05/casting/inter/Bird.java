package ch05.casting.inter;

public class Bird implements Animal, Fly{


    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void move() {
        System.out.println("새가 총총 걸어다닙니다.");
    }

    @Override
    public void Fly() {
        System.out.println("새가 날아다닙니다.");
    }
}
