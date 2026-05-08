package ch14.lamda.lamda03;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperatorMain {
    static void main() {
        Function<Integer, Integer> square01 = x -> x * x;
        UnaryOperator<Integer> square02 = x -> x * x;
        System.out.println(square01.apply(10));
        System.out.println(square02.apply(10));

        BiFunction<Integer, Integer, Integer> addition01 = (a, b) -> a + b;
        BinaryOperator<Integer> addition02 = (a, b) -> a + b;
        System.out.println(addition01.apply(10,20));
        System.out.println(addition02.apply(10,20));
    }
}
