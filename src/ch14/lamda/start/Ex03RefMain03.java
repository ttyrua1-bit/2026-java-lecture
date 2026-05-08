package ch14.lamda.start;

import ch14.lamda.Procedure;

import java.util.Random;

public class Ex03RefMain03 {
    static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("실행시간 : "+(endNs - startNs)+"ns");
    }
    static void main() {
        //
        Procedure dice = new Procedure() {
            @Override
            public void run() {
                int randomValue =  new Random().nextInt(6)+1;
                System.out.println("주사위 = "+randomValue);
            }
        };
        Procedure sum = new Procedure() {
            @Override
            public void run() {
                for(int i=1;i<=3;i++) {
                    System.out.println("i = "+i);
                }
            }
        };
        hello(dice);
        hello(sum);
    }
}