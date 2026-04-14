package ch05.casting.inter;

public class Pig implements Animal {
    @Override
    public void sound() {
        System.out.println("돼지가 꿀꿀");
    }





    @Override
    public void move() {
        System.out.println("돼지가 잘 안움직입니다.");
    }


}
