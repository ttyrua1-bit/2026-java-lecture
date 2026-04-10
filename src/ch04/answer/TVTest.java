package ch04.answer;

public class TVTest {
    static void main() {
        TV tv01 = new TV("LG",138,0);

        tv01.turnOn();
        tv01.volumeUp();
        tv01.volumeUp();
        tv01.volumeDown();
        tv01.turnOff();


    }
}
