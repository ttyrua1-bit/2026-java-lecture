package ch14.lamda.lamda03;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiMain {
    static void main() {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("sum : " + add.apply(10, 10));
        BiConsumer<String, Integer> repeat = (c, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print(c);
            }
            System.out.println();
        };
        repeat.accept("*", 10);
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println("isGreater : "+isGreater.test(10,20));
    }
}
