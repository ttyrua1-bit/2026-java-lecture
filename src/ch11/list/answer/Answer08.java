package ch11.list.answer;

import java.util.ArrayList;
import java.util.Iterator;


public class Answer08 {

    static void main() {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            nums.add(i);
        }
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                //System.out.println("size==="+nums.size());
            }
        }
        //1,2,3,4,5,6,7,8,9,10
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " / ");
        }
    }

}
