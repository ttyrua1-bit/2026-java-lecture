package ch14.lamda.lamda03;

import java.util.function.Function;

public class FunctionMain {
    static void main() {
        Function<String,Integer> function01 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println("function01 = "+function01.apply("hello"));
        Function<String,Integer> function02 = s -> s.length();
        System.out.println("function02 = "+function02.apply("hello"));
    }
}