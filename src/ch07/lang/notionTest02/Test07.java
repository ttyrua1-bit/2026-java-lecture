package ch07.lang.notionTest02;

import java.util.Random;

public class Test07 {
    static void main() {

        Random random = new Random();
        int sum = 0;
        int count =0;

        for(int i =0;i<5;i++){
            int num = random.nextInt(100)+1;
            System.out.println("생성된 수: "+num);
            sum += num;
            count++;

        }
        System.out.println("합계: "+sum);
        System.out.println("평균: "+(double)(sum/count));






    }


}
