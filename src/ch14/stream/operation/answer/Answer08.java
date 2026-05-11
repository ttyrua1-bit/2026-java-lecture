package ch14.stream.operation.answer;

import java.util.stream.DoubleStream;

public class Answer08 {
    static void main() {

        double[] scores = {85.5, 90.0, 70.5, 60.0, 95.5};
        double avg = DoubleStream.of(scores)
                .filter(score->score>=80)
                .average()
                .getAsDouble();
        System.out.println(avg);

    }
}
