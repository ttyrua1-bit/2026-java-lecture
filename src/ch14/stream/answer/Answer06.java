package ch14.stream.answer;

import java.util.List;
import java.util.function.Function;

public class Answer06 {
    static void main() {
        List<String> words = List.of("Apple", "Banana", "Berry", "Tomato");
        List<String> result =
                words.stream().filter(s->s.startsWith("B")).map(String::toUpperCase).toList();
        System.out.println(result);
    }
}
