package ch05.answer.Vehicle;

public class VehicleTest {
    static void main() {
        Car car01 = new Car();

        car01.speed = 50;
        car01.accelerate();

        System.out.println(car01.speed);



    }
}
