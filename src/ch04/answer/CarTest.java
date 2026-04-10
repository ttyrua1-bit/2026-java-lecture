package ch04.answer;

public class CarTest {
    static void main() {
        Car car01 = new Car("없음",100);

        car01.accelerate();
        car01.accelerate();
        car01.accelerate();
        car01.decelerate();

        System.out.println("최종 속도는 "+car01.speed+" 입니다.");
        



    }
}
