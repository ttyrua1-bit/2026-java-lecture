package ch10.exception.basic.checked;

public class CheckedThrowTest {
    static void main() throws MyCheckedException {
        Service service = new Service();
        service.callThrow();
    }
}
