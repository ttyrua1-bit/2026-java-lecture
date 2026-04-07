package NotionTest;

import java.util.Scanner;


public class Testall01 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        //1번문제
        System.out.println("원화를 입력하세요(단위 원)");
        int won1 = scanner.nextInt();
        double dol1 = won1/1500.0;   //혹은 (double)1500

        //System.out.println(won1+"원은 $"+dol1+"입니다.");
        System.out.printf("%d원은 $%.2f %s",won1,dol1,"입니다."); //.2는 소수점 둘째짜리까지

    }
}
