package ch06.car02;

public class CarTest01 {

    static void main() {
        Driver driver = new Driver();

        Car sonata = new Sonata();
        driver.setCar(sonata);
        driver.drive();

        Car sorento = new Sorento();
        driver.setCar(sorento);
        driver.drive();

        Car genesis = new Genesis();
        driver.setCar(genesis);
        driver.drive();

//        Car [] cars = {sonata,sorento,genesis};
//        for(Car car: cars) {      //car는 임의의 이름 item으로 해도 됨
//            driver.setCar(car);
//            driver.drive();
//        }
    }




}
