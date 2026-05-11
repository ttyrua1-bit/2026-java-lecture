package ch14.stream.answer;

import java.util.List;

public class Answer04 {
    static void main() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> square = nums.stream().map(n -> n * n).toList();
        System.out.println(square);
    }
}