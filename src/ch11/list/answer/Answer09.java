package ch11.list.answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Answer09 {

    static void main() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        int sum = 0;
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            sum+=iterator.next();
        }
        System.out.println(sum);

        //일반 배열을 ArrayList로 바꾸는 방법
        /*
        Integer [] nums = {10,20,30,40};
        //List<Integer> listNums = Arrays.asList(nums);
        ArrayList<Integer> listNums = new ArrayList<>(Arrays.asList(nums));
        listNums.add(100);
        System.out.println(listNums.get(0));
        System.out.println(listNums.get(1));
        System.out.println(listNums.get(2));
        System.out.println(listNums.get(3));
        System.out.println(listNums.get(4));
         */
    }

}
