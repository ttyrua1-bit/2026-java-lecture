package ch14.stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class IntermediatedOperationMain {
    static void main() {
        List<Integer> nums = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);
        //1.filter
        System.out.println("1. filter 짝수 출력");
        nums.stream().filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + "/"));
        System.out.println("");
        //2.map
        System.out.println("2. map 각 숫자를 제곱");
        nums.stream().map(n -> n * n).forEach(n -> System.out.print(n + "/"));
        System.out.println("");
        //3.distinct
        System.out.println("3. distinct 중복 제거");  // db에서 처리해서 넘어오는 경우가 많다.
        nums.stream().distinct().forEach(n -> System.out.print(n + "/"));
        System.out.println("");
        //4.sorted
        System.out.println("4. sorted 정렬");  // db에서 처리해서 넘어오는 경우가 많다.
        nums.stream().sorted().forEach(n -> System.out.print(n + "/"));
        System.out.println("");
        //5. 커스텀 정렬 sorted
        System.out.println("5. sorted 정렬");  // db에서 처리해서 넘어오는 경우가 많다.
        nums.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + "/"));
        System.out.println("");
        //6. peek
        System.out.println("6. peek 동작확인용 값을 바꾸지는 않는다. 잠시 들여다 보기");  // db에서 처리해서 넘어오는 경우가 많다.
        nums.stream().peek(n -> System.out.print("before : " + n + ","))
                .map(n -> n * n)
                .peek(n -> System.out.print("after : " + n + ","))
                .forEach(n -> System.out.println("최종값 : " + n));
        System.out.println("");
        //7. limit
        System.out.println("7. limit 처음 다섯개 들고오기");
        nums.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + "/"));
        System.out.println("");
        //8. skip
        System.out.println("8. skip 처음 다섯개 건너뛰기");
        nums.stream()
                .skip(5)
                .forEach(n -> System.out.print(n + "/"));
        System.out.println("");
        //9. takeWhile (자바 9부터 있음)
        System.out.println("9. takeWhile 조건을 만족할때까지 찾는다");
        nums.stream()
                .takeWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + "/"));
        System.out.println("");
        //10. dropWhile (자바 9부터 있음)
        System.out.println("10. dropWhile 5보다 작은 동안은 건너뛰기");
        nums.stream()
                .dropWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + "/"));
        System.out.println("");


    }
}