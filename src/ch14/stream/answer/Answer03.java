package ch14.stream.answer;

import java.util.List;

public class Answer03 {
    static void main() {
        List<String> names = List.of("kim", "lee", "park");
        List<String> result = names.stream().map(String::toUpperCase).toList();
        //List<String> result = names.stream().map(s->s.toUpperCase()).toList();
        System.out.println(result);
    }
}
