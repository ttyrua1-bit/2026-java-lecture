package ch14.stream.answer;

import java.util.List;

public class Answer09 {
    static void main() {
        List<String> names = List.of("Kim", "Lee", "Park", "Choi");
        List<String> result = names.stream().map(s->s.substring(0,1)).toList();
        System.out.println(result);
    }
}