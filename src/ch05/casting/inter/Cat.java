package ch05.casting.inter;

public class Cat implements Animal {

    String value="Cat";
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 사뿐사뿐 움직입니다.");
    }

}
