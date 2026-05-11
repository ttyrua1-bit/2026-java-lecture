package ch14.stream.answer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Answer01 {
    static void main() {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10); //1.list만들기... 불변객체
        List<Integer> even = nums.stream().filter(n ->  n%2==0).toList();
        System.out.println(nums);
        System.out.println(even);
//        List<Integer> even02 = new ArrayList<>();
//        for(int i=0;i<nums.size();i++) {
//            Integer n = nums.get(i);
//            if(n%2==0) {
//                even02.add(n);
//            }
//        }
    }
}