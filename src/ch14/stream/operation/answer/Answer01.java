package ch14.stream.operation.answer;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Answer01 {
    static void main() {
        List<String> words = List.of("apple", "kiwi", "banana", "fig", "grape");
//        IntStream intStream = words.stream()
//                .filter(s -> s.length()>=5)
//                .mapToInt(word->word.length());
//
        // System.out.println(intStream.sum());
        int sum = words.stream()
                .filter(s -> s.length()>=5)
                .mapToInt(word->word.length())
                .sum();
        System.out.println(sum);
        //intStream.forEach(n-> System.out.print(n+","));


    }
}