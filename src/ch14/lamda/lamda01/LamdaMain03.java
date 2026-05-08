package ch14.lamda.lamda01;

import ch14.lamda.MyFunction;
import ch14.lamda.Procedure;

public class LamdaMain03 {
    static void main() {
        MyFunction myFunction = ( a,  b) -> a + b;
        System.out.println("function03 : "+myFunction.apply(10,20));
    }
}