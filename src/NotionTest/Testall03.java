package NotionTest;
import java.util.Scanner;


public class Testall03 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("금액을 입력하시오");
        int won = scanner.nextInt();

        int won5 = won/50000;
        int won4 = won%50000/10000;
        int won3 = won%10000/1000;
        int won2 = won%1000/100;
        int won1 = won%100/50;
        int wonz = won%50/10;

        System.out.println("오만 원권"+won5+"매");
        System.out.println("만 원권"+won4+"매");
        System.out.println("천 원권"+won3+"매");
        System.out.println("100원 동전"+won2+"매");
        System.out.println("50원 동전"+won1+"매");
        System.out.println("10원 동전"+wonz+"매");



    }
}
