package ch14.stream.start;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamStartMain {
    static void main() {
        //Stream
        List<String> names = List.of("Apple","Banana","Berry","Tomato");
        Stream<String> stream = names.stream();
        List<String> result = stream
                .filter(s -> s.startsWith("B"))
                .map(s->s.toUpperCase())
                .toList();
        System.out.println(result);
    }
}
