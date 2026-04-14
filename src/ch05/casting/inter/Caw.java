package ch05.casting.inter;

public class Caw implements Animal {


    String value="CaW";
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소가 엉금엉금 움직입니다.");
    }

}
