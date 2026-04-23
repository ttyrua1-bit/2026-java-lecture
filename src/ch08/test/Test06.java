package ch08.test;

public class Test06 {
    static void main() {
        Grade02 grade02 = Grade02.BASIC;
        System.out.println(grade02.name()+"의 할인율은 " + grade02.getDiscount()+"%");
    }
}
