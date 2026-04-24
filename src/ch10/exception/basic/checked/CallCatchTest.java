package ch10.exception.basic.checked;

public class CallCatchTest {
    static void main() {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상종료");
    }
}
