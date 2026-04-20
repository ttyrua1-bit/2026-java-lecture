package ch07.lang.object.tostring;

public class ToStringTest01 {
    static void main() {
        Object object = new Object();
        String string = object.toString(); //디버깅  오류 찾아서 해결하는 과정 bug
        System.out.println(string);
        System.out.println(object);

    }
}
