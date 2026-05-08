package ch14.lamda.lamda01;

import ch14.lamda.MyFunction;
import ch14.lamda.Procedure;

public class LamdaMain02 {
    static void main() {
        Procedure procedure01 = () ->{
            System.out.println("hello");
        };
        Procedure procedure02 = () -> System.out.println("hello");

        MyFunction myFunction01 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("function01 : "+myFunction01.apply(10,20));
        MyFunction myFunction02 = (int a, int b) -> a + b;
        System.out.println("function02 : "+myFunction02.apply(10,20));
        MyFunction myFunction03 = (int a, int b) -> {
            System.out.println(a+"==="+b);
            return a + b;
        };
        System.out.println("function03 : "+myFunction03.apply(10,20));
        procedure01.run();
        procedure02.run();
    }
}
