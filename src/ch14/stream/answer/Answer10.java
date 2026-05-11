package ch14.stream.answer;

import java.util.List;

public class Answer10 {
    static void main() {
        List<Integer> nums = List.of(12, 3, 7, 9, 15, 2, 30, 21);
        List<Integer> result =
                nums.stream().filter(n -> n % 3 == 0).sorted().toList();
        System.out.println(result);
    }
}
