package ch14.lamda.methodref;

import java.util.function.BinaryOperator;

public class MethodRefStart02 {
    static void main() {
        BinaryOperator<Integer> add01 = (x, y) -> add(x,y);
        BinaryOperator<Integer> add02 = (x, y) -> add(x,y);

        Integer result01 = add01.apply(10,20);
        System.out.println("result01 = "+result01);
        Integer result02 = add02.apply(10,20);
        System.out.println("result02 = "+result02);
    }
    static int add(int x,int y) {
        return x+y;
    }
}