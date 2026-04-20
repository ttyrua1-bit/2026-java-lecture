package ch07.lang.immutable.change;

public class MutableObjTest {
    static void main() {
        MutableObj mutableObj =
                new MutableObj(10);
        mutableObj.add(20);
        System.out.println(mutableObj.getValue());
    }
}
