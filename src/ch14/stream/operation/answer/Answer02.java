package ch14.stream.operation.answer;

import java.util.stream.IntStream;

public class Answer02 {
    static void main() {
        long count = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .count();
        System.out.println(count);

        IntStream.rangeClosed(1, 100)
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .forEach(n-> System.out.print(n+","));
    }
}