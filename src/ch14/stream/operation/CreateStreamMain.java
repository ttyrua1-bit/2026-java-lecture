package ch14.stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamMain {
    static void main() {
        System.out.println("1. collection으로 부터 만들기");
        List<String> list = List.of("a", "b", "c");
        Stream<String> stream01 = list.stream();
        stream01.forEach(System.out::println);

        System.out.println("2. 배열로 부터 만들기");
        String[] arr = {"a", "b", "c"};
        Stream<String> stream02 = Arrays.stream(arr);
        stream02.forEach(System.out::println);

        System.out.println("3. Stream.of() 사용");
        Stream<String> stream03 = Stream.of("a", "b", "c");
        stream03.forEach(System.out::println);

        System.out.println("4. 무한 스트림 생성 iterate()");
        Stream<Integer> stream04 = Stream.iterate(1, n -> n + 1);
        stream04.limit(10).forEach(System.out::println);

        System.out.println("5. 무한 스트림 생성 generate()");
        Stream<Double> stream05 = Stream.generate(Math::random);
        stream05.limit(10).forEach(System.out::println);


    }
}