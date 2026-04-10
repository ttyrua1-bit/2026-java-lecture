package ch04.answer;

public class RectangleTest {
    static void main() {
        Rectangle rectangle01 = new Rectangle(10,10);

        System.out.println("사각형의 넓이는 : "+rectangle01.getArea());
        System.out.println("사각형의 둘레는 : "+rectangle01.getPerimeter());

    }
}
