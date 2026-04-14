package ch05.casting.abs;

public class Dog extends Animal {

    String value="Dog";
    void sound() {
        System.out.println("멍멍");
    }

    @Override
    void move() {
        System.out.println("개가 껑충껑충 움직입니다.");
    }


}
