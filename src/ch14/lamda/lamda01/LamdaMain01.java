package ch14.lamda.lamda01;

import ch14.lamda.MyFunction;

public class LamdaMain01 {
    static void main() {
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
    }
}