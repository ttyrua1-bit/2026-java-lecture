package ch14.stream.answer;

import java.util.List;

public class Answer05 {
    static void main() {
        List<String> names = List.of("Kim", "Lee", "Park", "Choi");
        List<Integer> result = names.stream().map(s->s.length()).toList();
        System.out.println(result);
    }
}