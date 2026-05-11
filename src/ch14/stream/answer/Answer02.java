package ch14.stream.answer;

import java.util.List;
import java.util.function.Predicate;

public class Answer02 {
    static void main() {
        List<String> words = List.of("apple","kiwi","banana","fig","grape");
        List<String> result = words.stream().filter(s -> s.length()>=5).toList();
        System.out.println(result);
    }
}
