package NotionTest;

import java.util.Scanner;

public class Testall02 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        //2번문제
        System.out.println("2자리수 정수 입력(10~99)");
        int num1 = scanner.nextInt();

        int num2 = num1/10;
        int num3 = num1%10;

        if(num2 == num3){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        else{
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
        }

    }
}
