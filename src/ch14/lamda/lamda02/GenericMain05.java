package ch14.lamda.lamda02;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericMain05 {
    static void main() {
        Function<String,String> upperCase = s->s.toUpperCase();
        String result01 = upperCase.apply("hello");
        System.out.println("result01 = "+result01);

        Function<Integer, Integer> square = n -> n * n;
        Integer result02 = square.apply(3);
        System.out.println("result02 = " + result02);

        Function<Integer, Boolean> isEven = num -> num % 2 == 0;
        Boolean result03 = isEven.apply(10);
        System.out.println("result03 = " + result03);
    }
}
//Function  입력 0 반환 0   apply()
//Consumer  입력 0 반환 x   accept()
//Supplier  입력 x 반환 0   get()
//Runnable  입력 x 반환 0   run()
