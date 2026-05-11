package ch14.stream.operation.answer;

import java.util.Comparator;
import java.util.List;

public class Answer04 {
    static void main() {
        List<Integer> nums = List.of(50, 10, 80, 30, 20, 90, 40);
        List<Integer> sortedList = nums.stream()
                //.sorted((a,b)->Integer.compare(b,a))
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(sortedList);
    }
}