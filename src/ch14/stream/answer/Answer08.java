package ch14.stream.answer;

import java.util.List;

public class Answer08 {
    static void main() {
        List<String> words = List.of("apple", "banana", "kiwi", "grape", "avocado");
        long count = words.stream().filter(s->s.contains("a")).count();
        System.out.println(count);
    }
}
