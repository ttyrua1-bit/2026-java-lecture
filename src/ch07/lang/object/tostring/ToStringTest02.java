package ch07.lang.object.tostring;

public class ToStringTest02 {
    static void main() {
        Car car = new Car("소나타");
        Dog dog = new Dog("댕댕이",3);
        System.out.println(car.toString());
        System.out.println(dog.toString());
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);
    }
}
