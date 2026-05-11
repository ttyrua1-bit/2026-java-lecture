package ch14.stream.operation;

import java.util.IntSummaryStatistics;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {
    static void main() {
        //기본형에 특화된 Stream 에는 IntStream,DoubleStream,LongStream
        IntStream intStream = IntStream.of(1,2,3,4,5);
        intStream.forEach(i-> System.out.print(i+ ","));
        System.out.println();
        IntStream range01 = IntStream.range(1,6);
        range01.forEach(n-> System.out.print(n+","));
        System.out.println();
        IntStream range02 = IntStream.rangeClosed(1,5);
        range02.forEach(n-> System.out.print(n+","));
        int sum = IntStream.range(1,6).sum();
        System.out.println("sum = "+sum);
        double avg = IntStream.range(1,6).average().getAsDouble();
        System.out.println("avg = "+avg);
        IntSummaryStatistics statistics = IntStream.rangeClosed(1,5).summaryStatistics();
        System.out.println("statistics.getAverage() = "+statistics.getAverage());
        System.out.println("statistics.getCount() = "+statistics.getCount());
        System.out.println("statistics.getMax() = "+statistics.getMax());
        System.out.println("statistics.getMin() = "+statistics.getMin());
        System.out.println("statistics.getSum() = "+statistics.getSum());

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
        IntStream intStream02 = integerStream.mapToInt(i->i); //왼쪽처럼해줘야 max()같은거 쓸수있음(아래코드)
        System.out.println(intStream02.max().getAsInt());

    }
}