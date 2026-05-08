package ch14.lamda.lamda02;

import java.util.List;

public class GenericMain03 {
    static void main() {
        GenericFunction<String, String> upperCase = new GenericFunction<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String result01 = upperCase.apply("hello");
        System.out.println("result01 = "+result01);

        GenericFunction<Integer, Integer> square = new GenericFunction<Integer, Integer>() {
            @Override
            public Integer apply(Integer s) {
                return s*s;
            }
        };
        Integer result02 = square.apply(3);
        System.out.println("result02 = "+result02);
    }

    @FunctionalInterface
    interface GenericFunction<T,R> {
        R apply(T s);
    }
}