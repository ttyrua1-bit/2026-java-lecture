package ch11.compare.answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer03 {
    static void main() {
        Integer[] scores = {80, 95, 70, 95, 60, 85};
        //Arrays.sort(scores, new DescComparator());
        Arrays.sort(scores,Comparator.reverseOrder());
        System.out.println(Arrays.toString(scores));
    }
}
class DescComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2,o1);
    }
}
