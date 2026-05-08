package ch14.lamda.start;

import java.util.Random;

public class Ex02RefMain {
    static void helloDice() {
        long startNs = System.nanoTime();

        int randomValue =  new Random().nextInt(6)+1;
        System.out.println("주사위 = "+randomValue);

        long endNs = System.nanoTime();
        System.out.println("실행시간 : "+(endNs - startNs)+"ns");
    }
    static void helloSum() {
        long startNs = System.nanoTime();

        for(int i=1;i<=3;i++) {
            System.out.println("i = "+i);
        }

        long endNs = System.nanoTime();
        System.out.println("실행시간 : "+(endNs - startNs)+"ns");
    }

    //    static void hello() {
//        long startNs = System.nanoTime();
//
//        for(int i=1;i<=3;i++) {
//            System.out.println("i = "+i);
//        }
//
//        long endNs = System.nanoTime();
//        System.out.println("실행시간 : "+(endNs - startNs)+"ns");
//    }
    static void main() {
        helloDice();
        helloSum();
    }
}
