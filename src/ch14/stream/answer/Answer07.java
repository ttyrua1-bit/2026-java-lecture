package ch14.stream.answer;

import java.util.List;

public class Answer07 {
    static void main() {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        int result = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}