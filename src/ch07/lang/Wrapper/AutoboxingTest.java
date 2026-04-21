package ch07.lang.Wrapper;

public class AutoboxingTest {
    static void main() {
        int value = 7;
        //Primitive ===> Wrapper
        Integer boxedValue =  Integer.valueOf(value);
        //Wrapper ===> Primitive
        int unboxedValue =  boxedValue.intValue();
        System.out.println("boxedValue = "+boxedValue);
        System.out.println("onboxedValue = "+unboxedValue);

    }
}
