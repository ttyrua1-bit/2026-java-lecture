package ch05.casting.abs;

public class Cat extends Animal {

    String value="Cat";
    void sound() {
        System.out.println("냐옹");
    }

    @Override
    void move() {
        System.out.println("고양이가 사뿐사뿐 움직입니다.");
    }

}
