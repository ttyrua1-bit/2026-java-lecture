package ch14.stream.operation.answer;

import java.util.List;

public class Answer10 {
    static void main() {
        List<Integer> nums = List.of(2, 4, 6, 8, 10);
        //1. 모두 짝수인가
        boolean allEven = nums.stream().allMatch(n -> n % 2 == 0);
        System.out.println(allEven);

        //2. 하나라도5보다 큰 수가 있는가?
        boolean anyMatch = nums.stream().anyMatch(n -> n > 5);
        System.out.println(anyMatch);

        //3. 음수가 하나도 없는가?
        boolean noneMatch = nums.stream().noneMatch(n -> n < 0);
        System.out.println(noneMatch);


    }
}