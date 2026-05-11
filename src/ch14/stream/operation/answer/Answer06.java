package ch14.stream.operation.answer;

import java.util.List;
import java.util.stream.IntStream;

public class Answer06 {
    static void main() {
        //int
        List<Integer> result = IntStream.rangeClosed(1,10)
                .filter(n->n%2==0)
                .boxed()  //int  --> Integer
                .toList();
        System.out.println(result);
    }
}
