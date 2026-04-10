package ch04.answer;



public class Circle {
    int radius;
    double pi = 3.14;

    Circle(int radius){
        this.radius = radius;
    }

    void getArea(){
        System.out.println("원의 넓이는 "+(radius*radius*pi)+" 입니다.");
    }



}
