package ch10.exception.basic.unchecked;

public class CheckedThrowTest {
    static void main() {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상종료");
    }
}
