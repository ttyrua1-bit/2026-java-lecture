package ch05.answer.Shape;

public class Circle extends Shape{
    double pi = 3.14;
    int r;     //원의 반지름


    void area(){
        System.out.printf("원의 넓이는 %.2f 입니다.",r*r*pi);
    }






}
