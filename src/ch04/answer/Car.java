package ch04.answer;

public class Car {
    String brand;
    int speed;

    Car(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }

    void accelerate(){
        speed += 10;
    }
    void decelerate(){
        if(speed>0){
        speed -= 10;
        }
    }

}
