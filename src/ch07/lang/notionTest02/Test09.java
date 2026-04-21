package ch07.lang.notionTest02;

import java.util.Random;

public class Test09 {
    static void main() {

        Random random = new Random();

        int num1 = random.nextInt(6)+1;
        int num2 = random.nextInt(6)+1;
        int sum = num1+num2;


        System.out.println("첫번째 주사위: "+num1);
        System.out.println("두번째 주사위: "+num2);
        System.out.println("합계: "+sum);





    }


}
