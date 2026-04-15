package ch06.car01;

public class CarTest01 {

    static void main() {
        Driver driver = new Driver();
        Sonata sonata = new Sonata();
        driver.setSonata(sonata);
        driver.drive();

        Sorento sorento = new Sorento();
        driver.setSonata(null);
        driver.setSorento(sorento);
        driver.drive();



    }




}
