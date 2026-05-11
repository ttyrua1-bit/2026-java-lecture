package ch14.stream.operation.answer;

import java.util.List;

public class Answer09 {
    static void main() {
        List<String> words = List.of("java", "spring", "jpa", "redis");
        List<String> result = words.stream()
                .peek(word-> System.out.println("원본 : "+word))
                .map(String::toUpperCase)
                .toList();
        System.out.println(result);
    }
}