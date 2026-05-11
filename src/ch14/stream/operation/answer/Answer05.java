package ch14.stream.operation.answer;

import java.util.List;

public class Answer05 {
    static void main() {
        List<String> names = List.of("kim", "lee", "park", "choi", "jung", "kang");
        List<String> result = names.stream().skip(2).limit(3).toList();
        System.out.println(result);
    }
}