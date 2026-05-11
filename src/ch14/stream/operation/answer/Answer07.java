package ch14.stream.operation.answer;

import java.util.stream.LongStream;

public class Answer07 {
    static void main() {
        long result = LongStream.rangeClosed(1, 10)
                .reduce(1, (a, b) -> a * b);
        System.out.println(result);
    }
}