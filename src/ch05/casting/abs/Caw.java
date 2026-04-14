package ch05.casting.abs;

public class Caw extends Animal {


    String value="CaW";
    void sound() {
        System.out.println("음메");
    }

    @Override
    void move() {
        System.out.println("소가 엉금엉금 움직입니다.");
    }

}
