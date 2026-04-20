package ch07.lang.immutable.change;

public class ImmutableObjTest {
    static void main() {
        ImmutableObj immutableObj =
                new ImmutableObj(10);
        ImmutableObj changeImmutableObj = immutableObj.add(20);
        System.out.println(immutableObj.getValue());
        System.out.println(changeImmutableObj.getValue());
        System.out.println(immutableObj);
        System.out.println(changeImmutableObj);
    }
}
