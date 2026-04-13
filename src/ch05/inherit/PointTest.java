package ch05.inherit;

public class PointTest {
    static void main() {
        Point point = new Point();
        point.x = 10;
        point.y = 10;
        point.showPoint();
        ColorPoint colorPoint = new ColorPoint();
        colorPoint.color ="red";
        colorPoint.x=20;
        colorPoint.y=20;
        colorPoint.showPoint();
        colorPoint.showColorPoint();
    }

}
