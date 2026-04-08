package NotionTest;

import java.util.Scanner;


public class Testall06 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1~99사이의 정수를 입력하시오");
        int num = scanner.nextInt();

        if(num == 0){
            System.out.println("잘못된입력입니다.");
            return ;
        }


        if((num%10)%3 == 0)
        {
            if((num/10) == 3){
                System.out.println("박수짝짝");
            }
            else{
                System.out.println("박수짝");
            }
        }
        else{
            System.out.println("패스");
        }


    }


}
